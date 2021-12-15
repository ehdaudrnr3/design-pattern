package com.design.pattern.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SergeantVisitor implements UnitVisitor {

    @Override
    public void visitSoldier(Soldier soldier) {
        //do nothing
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        log.info("Hello {}", sergeant);
    }

    @Override
    public void visitCommander(Commander commander) {
        //do nothing
    }
}
