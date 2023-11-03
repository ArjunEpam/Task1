package pizza;

import java.util.ArrayList;
import java.util.List;

class Pizza {
    private Base base;
    private List<Topping> toppings;

    public Pizza(Base base) {
        this.base = base;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void removeTopping(Topping topping) {
        toppings.remove(topping);
    }

    public double calculateCost() {
        double baseCost = base.getCost();
        double toppingsCost = getToppingsCost();
        return baseCost + toppingsCost;
    }

    private double getToppingsCost() {
        double totalToppingsCost = 0;
        for (Topping topping : toppings) {
            totalToppingsCost += topping.getCost();
        }
        return totalToppingsCost;
    }
}