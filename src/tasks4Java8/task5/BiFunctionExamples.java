package tasks4Java8.task5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

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

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}

public class BiFunctionExamples {
    public static void main(String[] args) {
        BiFunction<String, Double, Product> productCreator = (name, price) ->
                new Product(name, price, "Unknown", "Standard");

        Product newProduct = productCreator.apply("New Product", 999.99);
        System.out.println("New Product created: " + newProduct);

        BiFunction<Map<Product, Integer>, BiFunction<Product, Integer, Double>, Double> calculateCartCost =
                (cart, costCalculator) ->
                        cart.entrySet().stream()
                                .mapToDouble(entry -> costCalculator.apply(entry.getKey(), entry.getValue()))
                                .sum();

        Map<Product, Integer> cart = new HashMap<>();
        cart.put(new Product("Laptop", 1500.0, "Electronics", "Standard"), 2);
        cart.put(new Product("TV", 1200.0, "Electronics", "Standard"), 1);
        cart.put(new Product("Shoes", 800.0, "Fashion", "Standard"), 3);

        BiFunction<Product, Integer, Double> costCalculator = (product, quantity) ->
                product.getPrice() * quantity;

        double totalCost = calculateCartCost.apply(cart, costCalculator);
        System.out.println("Total cost of the cart: $" + totalCost);
    }
}
