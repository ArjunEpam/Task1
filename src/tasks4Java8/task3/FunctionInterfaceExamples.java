package tasks4Java8.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

public class FunctionInterfaceExamples {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500.0, "Electronics", 4));
        products.add(new Product("Mobile Phone", 900.0, "Electronics", 3));
        products.add(new Product("TV", 1200.0, "Electronics", 5));
        products.add(new Product("Shoes", 800.0, "Fashion", 4));

        double totalCost = calculateTotalCost(products);
        System.out.println("Total cost of all products: " + totalCost);

        double costAbove1000 = calculateTotalCost(products, product -> product.getPrice() > 1000);
        System.out.println("Total cost of products with price > 1000: " + costAbove1000);

        double electronicCost = calculateTotalCost(products, product -> "Electronics".equals(product.getCategory()));
        System.out.println("Total cost of electronic products: " + electronicCost);

        List<Product> expensiveElectronics = getFilteredProducts(products,
                product -> product.getPrice() > 1000 && "Electronics".equals(product.getCategory()));
        System.out.println("Expensive electronics:");
        for (Product product : expensiveElectronics) {
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
        }
    }

    public static double calculateTotalCost(List<Product> products) {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static double calculateTotalCost(List<Product> products, ProductPredicate predicate) {
        return products.stream()
                .filter(predicate::test)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static List<Product> getFilteredProducts(List<Product> products, ProductPredicate predicate) {
        return products.stream()
                .filter(predicate::test).collect(Collectors.toList());
    }

    @FunctionalInterface
    interface ProductPredicate {
        boolean test(Product product);
    }
}
