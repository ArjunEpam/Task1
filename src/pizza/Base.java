package pizza;

class Base {
    private final String name;
    private final double cost;

    public Base(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}