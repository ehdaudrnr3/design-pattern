package com.design.pattern.templateMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HItAndRunMethod extends StealingMethod {

    @Override
    protected String pickTarget() {
        return "old goblin women";
    }

    @Override
    protected void confuseTarget(String target) {
        log.info("Approach the {} from behind.", target);
    }

    @Override
    protected void stealTheItem(String target) {
        log.info("Grab the handbag and run away fast!");
    }
}
