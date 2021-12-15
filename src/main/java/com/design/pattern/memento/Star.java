package com.design.pattern.memento;

import lombok.Getter;

public class Star {

    private StarType type;
    private int ageYears;
    private int massTons;

    public Star(StarType type, int ageYears, int massTon) {
        this.type = type;
        this.ageYears = ageYears;
        this.massTons = massTon;
    }

    public void timePasses() {
        ageYears *= 2;
        massTons *= 8;

        switch (type) {
            case RED_GIANT:
                type = StarType.WHITE_DWARF;
                break;
            case SUN:
                type = StarType.RED_GIANT;
                break;
            case SUPERNOVA:
                type = StarType.DEAD;
                break;
            case WHITE_DWARF:
                type = StarType.SUPERNOVA;
                break;
            case DEAD:
                ageYears *= 2;
                massTons = 0;
                break;
            default:
                break;
        }
    }

    public StarMemento save() {
        return new StartMementoInternal(type, ageYears, massTons);
    }

    public void restore(StarMemento memento) {
        var state = (StartMementoInternal) memento;
        this.type = state.getType();
        this.ageYears = state.getAgeYears();
        this.massTons = state.getMassTons();
    }

    @Override
    public String toString() {
        return String.format("%s age: %d years mass: %d tons", type.toString(), ageYears, massTons);
    }

    @Getter
    private static class StartMementoInternal implements StarMemento {
        private StarType type;
        private int ageYears;
        private int massTons;

        public StartMementoInternal(StarType type, int ageYears, int massTons) {
            this.type = type;
            this.ageYears = ageYears;
            this.massTons = massTons;
        }
    }
}
