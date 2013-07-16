package com.study.spring.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("xin")
public class Xin implements Member {
    private static String name="Xin";
    @Autowired
    @Qualifier("chapter4")
    private Slides chapter4;

    public String getName() { return name; }
    public Slides getSlides() { return chapter4; }

    public void presents() {
        System.out.println(String.format("%s will present %s", name, chapter4.getSubject()));
        System.out.println(chapter4.getContents());
    }
    
    public void presents(Slides slides) {
        System.out.println(String.format("%s will present %s", name, slides.getSubject()));
        System.out.println(slides.getContents());        
    }
}
