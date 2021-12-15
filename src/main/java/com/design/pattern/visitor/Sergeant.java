package com.design.pattern.visitor;

public class Sergeant extends Unit {

    public Sergeant(Unit... units) {
        super(units);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitSergeant(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Sergeant";
    }
}
