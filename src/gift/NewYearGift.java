package gift;

import java.util.List;

public class NewYearGift {
    public static void main(String[] args) {
        Gift gift = new Gift();
        gift.addSweet(new Chocolate("Milk Chocolate", 30.0, "Milk"));
        gift.addSweet(new Chocolate("Dark Chocolate", 25.0, "Dark"));
        gift.addSweet(new Candy("Toffee", 15.0, "Hard"));
        gift.addSweet(new Candy("Gummy Bears", 10.0, "Gummy"));

        System.out.println("Total weight of the gift: " + gift.getTotalWeight() + " grams");

        gift.sortChocolatesByFlavor();
        System.out.println("Chocolates in the gift sorted by flavor: " + gift.sweets);

        List<Sweet> selectedCandies = gift.getCandiesInPriceRange(10.0, 20.0);
        System.out.println("Candies in the price range of $10 to $20: " + selectedCandies);
    }
}