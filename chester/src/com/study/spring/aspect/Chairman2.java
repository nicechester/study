package com.study.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Chairman2 {
    public void introduceAndMoveOn(ProceedingJoinPoint joinpoint) {
        System.out.println("[Chairman] Next speaker, please!");
        try {
            joinpoint.proceed();
            System.out.println("[Chairman] It was nice presentation.");        
        } catch (Throwable e) {
            System.out.println("[Chairman] Sorry to miss it.");
        }
    }
}
