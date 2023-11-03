package homeAppliances;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Appliance {
    private String name;
    private int powerConsumption;

    public Appliance(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Apartment {
    private List<Appliance> appliances = new ArrayList<>();

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public int calculatePowerConsumption() {
        int totalPowerConsumption = 0;
        for (Appliance appliance : appliances) {
            totalPowerConsumption += appliance.getPowerConsumption();
        }
        return totalPowerConsumption;
    }

    public void sortAppliances(Comparator<Appliance> comparator) {
        Collections.sort(appliances, comparator);
    }

    public List<Appliance> getAppliances() {
        return appliances;
    }
}

public class HomeAppliances {
    public static void main(String[] args) {
        Apartment apartment = new Apartment();
        apartment.addAppliance(new Appliance("Fan", 1));
        apartment.addAppliance(new Appliance("Light", 2));
        apartment.addAppliance(new Appliance("TV", 3));
        apartment.addAppliance(new Appliance("Laptop", 4));

        int totalPowerConsumption = apartment.calculatePowerConsumption();
        System.out.println("Total power consumption: " + totalPowerConsumption + " units");

        apartment.sortAppliances(Comparator.comparing(Appliance::getPowerConsumption));
        System.out.println("Appliances sorted by power consumption: " + apartment.getAppliances());
    }
}