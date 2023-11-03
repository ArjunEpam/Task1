package pizza;

public class PizzaShop {
    public static void main(String[] args) {
        Base standardBase = new Base("Standard", 5.00);
        Pizza pizza = new Pizza(standardBase);
        pizza.addTopping(new TomatoTopping());
        pizza.addTopping(new MushroomTopping());

        double totalCost = pizza.calculateCost();
        System.out.printf("The total cost of the pizza is $%.2f%n", totalCost);
    }
}