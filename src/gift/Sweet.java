package gift;

abstract class Sweet {
    private String name;
    private double weight;

    public Sweet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Chocolate extends Sweet {
    private String flavor;

    public Chocolate(String name, double weight, String flavor) {
        super(name, weight);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}

class Candy extends Sweet {
    private String type;

    public Candy(String name, double weight, String type) {
        super(name, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}