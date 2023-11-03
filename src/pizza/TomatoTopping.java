package pizza;

class TomatoTopping implements Topping {
    @Override
    public double getCost() {
        return 1.50;
    }

    @Override
    public String getName() {
        return "Tomato";
    }
}