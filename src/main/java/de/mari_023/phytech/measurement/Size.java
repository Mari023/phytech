package de.mari_023.phytech.measurement;

import de.mari_023.phytech.measurement.quantity.Quantity;
import de.mari_023.phytech.measurement.unit.Unit;

public class Size<T extends Quantity> {
    private Unit<T> unit;
    public double value;

    public Size(Unit<T> unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public Unit<T> getUnit() {
        return unit;
    }

    public void setUnit(Unit<T> unit) {
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Size<T> copy() {
        return new Size<>(unit, value);
    }
}
