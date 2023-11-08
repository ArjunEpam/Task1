package tasks4Java8.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private String name;
    private double price;
    private String category;
    private String grade;

    public Product(String name, double price, String category, String grade) {
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
}

public class ProductProcessing {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500.0, "Electronics", "Standard"));
        products.add(new Product("Mobile Phone", 900.0, "Electronics", "Standard"));
        products.add(new Product("TV", 1200.0, "Electronics", "Standard"));
        products.add(new Product("Shoes", 800.0, "Fashion", "Standard"));

        List<Product> expensiveProducts = products.stream()
                .filter(product -> product.getPrice() > 1000)
                .collect(Collectors.toList());

        List<Product> electronicsProducts = products.stream()
                .filter(product -> "Electronics".equals(product.getCategory()))
                .collect(Collectors.toList());

        List<Product> expensiveElectronics = products.stream()
                .filter(product -> product.getPrice() > 1000 && "Electronics".equals(product.getCategory()))
                .map(product -> new Product(product.getName().toUpperCase(), product.getPrice(), product.getCategory(), product.getName()))
                .collect(Collectors.toList());

        long electronicProductCount = products.stream()
                .filter(product -> "Electronics".equals(product.getCategory()))
                .count();

        System.out.println("Products with price > 1000:");
        expensiveProducts.forEach(product -> System.out.println(product.getName()));

        System.out.println("\nElectronics Products:");
        electronicsProducts.forEach(product -> System.out.println(product.getName()));

        System.out.println("\nExpensive Electronics Products with Names in UPPERCASE:");
        expensiveElectronics.forEach(product -> System.out.println(product.getName()));

        System.out.println("\nCount of Electronic Products: " + electronicProductCount);
    }
}
