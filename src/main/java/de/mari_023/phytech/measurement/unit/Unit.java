package de.mari_023.phytech.measurement.unit;

import de.mari_023.phytech.measurement.quantity.Quantity;

public abstract class Unit<T extends Quantity> {

    private final String name;
    private final Quantity quantity;
    private final boolean isJoke;
    private final Unit<T> SIUnit;
    private final double conversionFactor;

    public Unit(String name, Quantity quantity) {
        this(name, quantity, null, 1, false);
    }

    public Unit(String name, Quantity quantity, Unit<T> SIUnit, double conversionFactor) {
        this(name, quantity, SIUnit, conversionFactor, false);
    }

    public Unit(String name, Quantity quantity, Unit<T> SIUnit, double conversionFactor, boolean isJoke) {
        this.name = name;
        this.quantity = quantity;
        this.isJoke = isJoke;
        this.SIUnit = SIUnit;
        this.conversionFactor = conversionFactor;
    }

    public String getName() {
        return name;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public boolean isSI() {
        return SIUnit != null;
    }

    public boolean isJoke() {
        return isJoke;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }

    public Unit<T> getSIUnit() {
        return SIUnit == null ? this : SIUnit;
    }
}
