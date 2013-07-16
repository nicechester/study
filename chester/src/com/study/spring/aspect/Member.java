package com.study.spring.aspect;


public interface Member {
    void presents();
    void presents(Slides slides);
    String getName();
    Slides getSlides();
}