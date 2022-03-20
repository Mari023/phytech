package de.mari_023.phytech.measurement.quantity;

public abstract class Quantity {

    private final String name;

    public Quantity(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
