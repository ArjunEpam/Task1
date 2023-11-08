package tasks4Java8.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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

public class ConsumerSupplierExamples {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500.0, "Electronics", "Standard"));
        products.add(new Product("Smartphone", 900.0, "Electronics", "Standard"));
        products.add(new Product("TV", 1200.0, "Electronics", "Standard"));
        products.add(new Product("Shoes", 800.0, "Fashion", "Standard"));

        Consumer<Product> productPrinter = product -> System.out.println(product);

        Consumer<Product> premiumGradeUpdater = product -> {
            if (product.getPrice() > 1000) {
                product.setGrade("Premium");
            }
        };

        Consumer<Product> nameUpdater = product -> {
            if (product.getPrice() > 3000) {
                product.setName(product.getName() + "*");
            }
        };

        products.forEach(premiumGradeUpdater.andThen(nameUpdater));

        System.out.println("Updated Products:");
        products.forEach(productPrinter);

        System.out.println("Premium Grade Products with '*' in Name:");
        products.stream()
                .filter(product -> "Premium".equals(product.getGrade()))
                .forEach(productPrinter);

        Supplier<Product> randomProductSupplier = () -> {
            Random random = new Random();
            String[] categories = {"Electronics", "Fashion", "Home Appliances"};
            String category = categories[random.nextInt(categories.length)];
            String[] productNames = {"Smartwatch", "Camera", "Sneakers", "Refrigerator", "Headphones"};
            String productName = productNames[random.nextInt(productNames.length)];
            double price = random.nextDouble() * 5000;
            return new Product(productName, price, category, "Standard");
        };

        Supplier<String> randomOtpSupplier = () -> {
            Random random = new Random();
            return String.format("%04d", random.nextInt(10000));
        };

        Product randomProduct = randomProductSupplier.get();
        System.out.println("Random Product: " + randomProduct);

        String randomOtp = randomOtpSupplier.get();
        System.out.println("Random OTP: " + randomOtp);
    }
}
