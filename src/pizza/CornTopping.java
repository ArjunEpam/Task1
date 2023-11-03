package pizza;

class CornTopping implements Topping {
    @Override
    public double getCost() {
        return 2.00;
    }

    @Override
    public String getName() {
        return "Corn";
    }
}