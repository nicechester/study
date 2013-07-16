package com.study.spring.scope;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public abstract class Espresso {
    private static AtomicInteger counter = new AtomicInteger(0);
    @Autowired private Coffee coffee;
    
    public Espresso() { 
        System.out.println("counter = " + counter.incrementAndGet());
    }
    
    public abstract Coffee getCoffee();
}
