package com.design.pattern.proxy.java;

import com.design.pattern.proxy.DefaultTower;
import com.design.pattern.proxy.Person;
import com.design.pattern.proxy.Tower;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;

@Slf4j
public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        Tower proxy = getTowerPorxy(new DefaultTower());
        proxy.enter(new Person("red"));
    }

    private Tower getTowerPorxy(DefaultTower defaultTower) {
        return (Tower) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] {Tower.class}, (proxy, method, args) -> {
            log.info("start");
            method.invoke(defaultTower, args);
            log.info("end");
            return null;
        });

    }
}
