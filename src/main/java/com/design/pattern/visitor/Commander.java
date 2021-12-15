package com.design.pattern.visitor;

public class Commander extends Unit {

    public Commander(Unit... units) {
        super(units);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitCommander(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Commander";
    }
}
