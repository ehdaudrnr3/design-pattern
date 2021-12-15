package com.design.pattern.visitor;

import java.util.Arrays;

public abstract class Unit {

    private final Unit[] units;

    public Unit(Unit... units) {
        this.units = units;
    }

    public void accept(UnitVisitor visitor) {
        Arrays.stream(units).forEach(unit -> unit.accept(visitor));
    }
}
