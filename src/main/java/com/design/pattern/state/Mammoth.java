package com.design.pattern.state;

public class Mammoth {
    private State state;

    public Mammoth() {
        state = new PeacefulState(this);
    }

    public void timePasses() {
        if(state instanceof PeacefulState) {
            changeState(new AngryState(this));
        } else {
            changeState(new PeacefulState(this));
        }
    }

    private void changeState(State state) {
        this.state = state;
        this.state.onEnterState();
    }

    public void observe() {
        state.observe();
    }

    @Override
    public String toString() {
        return "The mammoth";
    }
}
