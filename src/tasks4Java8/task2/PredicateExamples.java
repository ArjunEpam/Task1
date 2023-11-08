package tasks4Java8.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Product {
    private String name;
    private double price;
    private String category;
    private int grade;

    public Product(String name, double price, String category, int grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getGrade() {
        return grade;
    }
}

class Response<T> {
    private T responseBody;
    private int statusCode;
    private String responseType;

    public Response(T responseBody, int statusCode, String responseType) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }

    public T getResponseBody() {
        return responseBody;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getResponseType() {
        return responseType;
    }
}

public class PredicateExamples {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500.0, "Electronics", 4));
        products.add(new Product("Mobile Phone", 900.0, "Electronics", 3));
        products.add(new Product("TV", 1200.0, "Electronics", 5));
        products.add(new Product("Shoes", 800.0, "Fashion", 4));

        List<Response<String>> responses = new ArrayList<>();
        responses.add(new Response<>("Response 1", 200, "JSON"));
        responses.add(new Response<>("Response 2", 400, "XML"));
        responses.add(new Response<>("Response 3", 400, "JSON"));
        responses.add(new Response<>("Response 4", 500, "JSON"));

        Predicate<Product> priceGreaterThan1000 = product -> product.getPrice() > 1000;
        Predicate<Product> electronicsCategory = product -> "Electronics".equals(product.getCategory());
        Predicate<Response<String>> statusCode400 = response -> response.getStatusCode() == 400;
        Predicate<Response<String>> responseTypeJSON = response -> "JSON".equals(response.getResponseType());

        System.out.println("Products with price greater than 1000:");
        printFilteredProducts(products, priceGreaterThan1000);

        System.out.println("\nProducts in Electronics category:");
        printFilteredProducts(products, electronicsCategory);

        System.out.println("\nProducts with price greater than 100 or in Electronics category:");
        printFilteredProducts(products, priceGreaterThan1000.or(electronicsCategory));

        System.out.println("\nProducts with price less than 100 and in Electronics category:");
        printFilteredProducts(products, priceGreaterThan1000.negate().and(electronicsCategory));

        System.out.println("\nResponses with status code 400:");
        printFilteredResponses(responses, statusCode400);

        System.out.println("\nResponses with response type JSON:");
        printFilteredResponses(responses, responseTypeJSON);

        System.out.println("\nResponses with status code 400 and response type JSON:");
        printFilteredResponses(responses, statusCode400.and(responseTypeJSON));

        System.out.println("\nResponses with status code 400 or response type JSON:");
        printFilteredResponses(responses, statusCode400.or(responseTypeJSON));

        System.out.println("\nResponses with status code not 400 and response type JSON:");
        printFilteredResponses(responses, statusCode400.negate().and(responseTypeJSON));
    }

    public static void printFilteredProducts(List<Product> products, Predicate<Product> predicate) {
        products.stream()
                .filter(predicate)
                .forEach(product -> System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice()));
    }

    public static void printFilteredResponses(List<Response<String>> responses, Predicate<Response<String>> predicate) {
        responses.stream()
                .filter(predicate)
                .forEach(response -> System.out.println("Response: " + response.getResponseBody()));
    }
}
