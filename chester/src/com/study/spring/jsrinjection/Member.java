package com.study.spring.jsrinjection;

public class Member {
    private Slide slide;
    private String name;
    public Member(Slide slide, String name) {
        this.slide = slide;
        this.name = name;
    }
    
    public void presents() {
        System.out.println(String.format("%s presents %s: '%s'", name, slide.getSubject(), slide.getContents()));
    }
    
    Slide getSlide() { return slide; }
}
