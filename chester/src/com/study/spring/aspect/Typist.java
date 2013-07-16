package com.study.spring.aspect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Typist {
    private static final List<Slides> book = new ArrayList<Slides>();
    
    public void fileSlides(Slides slides) {
        System.out.println("[typist] tick, tick, tick..");
        book.add(slides);
    }
    
    public List<Slides> getBook() {
        return Collections.unmodifiableList(book);
    }
}
