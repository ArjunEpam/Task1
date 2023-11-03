package pizza;

class MushroomTopping implements Topping {
    @Override
    public double getCost() {
        return 2.50;
    }

    @Override
    public String getName() {
        return "Mushrooms";
    }
}