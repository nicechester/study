package com.study.spring.aspect;

import org.springframework.stereotype.Component;

@Component
public class Chairman {
    public void introduces() {
        System.out.println("[Chairman] Next speaker, please!");
    }
    
    public void complements() {
        System.out.println("[Chairman] It was nice presentation.");
    }
    
    public void sorry() {
        System.out.println("[Chairman] Sorry to miss it.");
    }
}
