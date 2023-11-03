package bouquet;

import java.util.ArrayList;
import java.util.List;

class Bouquet {
    private List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public double calculateCost() {
        double totalCost = 0;
        for (Flower flower : flowers) {
            totalCost += flower.getCost();
        }
        return totalCost;
    }
}