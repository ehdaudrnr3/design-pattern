package com.design.pattern.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SoldierVisitor implements UnitVisitor {

    @Override
    public void visitSoldier(Soldier soldier) {
        log.info("Greetings {}", soldier);
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        //do nothing
    }

    @Override
    public void visitCommander(Commander commander) {
        //do nothing
    }
}
