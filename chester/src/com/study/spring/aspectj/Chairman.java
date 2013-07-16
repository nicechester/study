package com.study.spring.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Chairman {

    @Pointcut("execution(* com.study.spring.aspect.Member.presents(..))")
    public void presents() {}
    
    @Before("presents()")
    public void introduces() {
        System.out.println("[Chairman] Next speaker, please!");
    }
    
    @AfterReturning("presents()")
    public void complements() {
        System.out.println("[Chairman] It was nice presentation.");
    }
    
    @AfterThrowing("presents()")
    public void sorry() {
        System.out.println("[Chairman] Sorry to miss it.");
    }
}
