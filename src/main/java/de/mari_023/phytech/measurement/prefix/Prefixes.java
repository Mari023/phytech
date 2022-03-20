package de.mari_023.phytech.measurement.prefix;

public enum Prefixes {
    //SI Prefixes
    NANO(1, 10 ^ 9),
    MICRO(1, 10 ^ 6),
    MILLI(1, 10 ^ 3),
    CENTI(1, 10 ^ 2),
    DECI(1, 10),
    ONE(1, 1),
    DECA(10, 1),
    HECTO(10 ^ 2, 1),
    KILO(10 ^ 3, 1),
    MEGA(10 ^ 6, 1),
    GIGA(10 ^ 9, 1),

    //NON-SI Prefixes
    DOZEN(12, 1, false);

    public final int numerator;
    public final int denominator;
    public final boolean isSI;

    Prefixes(int numerator, int denominator) {
        this(numerator, denominator, true);
    }

    Prefixes(int numerator, int denominator, boolean isSI) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.isSI = isSI;
    }
}
