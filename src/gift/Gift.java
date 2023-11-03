package gift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Gift {
    List<Sweet> sweets = new ArrayList<>();

    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Sweet sweet : sweets) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    public void sortChocolatesByFlavor() {
        sweets.removeIf(sweet -> !(sweet instanceof Chocolate));
        Collections.sort(sweets, (s1, s2) -> ((Chocolate) s1).getFlavor().compareTo(((Chocolate) s2).getFlavor()));
    }

    public List<Sweet> getCandiesInPriceRange(double minPrice, double maxPrice) {
        List<Sweet> selectedCandies = new ArrayList<>();
        for (Sweet sweet : sweets) {
            if (sweet instanceof Candy) {
                double sweetPrice = sweet.getWeight();
                if (sweetPrice >= minPrice && sweetPrice <= maxPrice) {
                    selectedCandies.add(sweet);
                }
            }
        }
        return selectedCandies;
    }
}