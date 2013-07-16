package com.study.spring.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("greg")
public class Greg implements Member {
    private static String name="Greg";
    @Autowired
    @Qualifier("chapter3")
    private Slides chapter3;

    public String getName() { return name; }
    public Slides getSlides() { return chapter3; }
    
    public void presents() {
        System.out.println(String.format("%s will present %s", name, chapter3.getSubject()));
        System.out.println(chapter3.getContents());
    }
    
    public void presents(Slides slides) {
        System.out.println("Ooops!  I'm not ready for this slides - " + slides.getSubject());
        throw new RuntimeException();
    }
}
