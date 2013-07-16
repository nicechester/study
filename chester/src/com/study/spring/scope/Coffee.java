package com.study.spring.scope;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Coffee {
    private static AtomicInteger counter = new AtomicInteger(0);
    
    public Coffee() { 
        System.out.println("counter = " + counter.incrementAndGet());
    }
}
