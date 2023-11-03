package bouquet;

public class FlowerShop {
    public static void main(String[] args) {
        Flower rose = new Flower("Rose", 1.0);
        Flower jasmine = new Flower("Jasmine", 2.0);
        Flower lily = new Flower("Lily", 3.0);

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rose);
        bouquet.addFlower(jasmine);
        bouquet.addFlower(lily);

        double bouquetCost = bouquet.calculateCost();
        System.out.printf("The cost of the bouquet is $%.2f%n", bouquetCost);
    }
}




