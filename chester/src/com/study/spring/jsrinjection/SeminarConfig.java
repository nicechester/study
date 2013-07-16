package com.study.spring.jsrinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeminarConfig {
    @Bean Slide aop() { return new Slide("Aspect Oriented Programming", "AOP isn't easy but worthy to try!"); }
    @Bean Slide injection() { return new Slide("Spring Injection", "2 types of injection: parameter or constructor."); }
    @Bean Member xin() { return new Member(aop(), "Xin"); }
    @Bean Member greg() { return new Member(injection(), "Greg"); }
}
