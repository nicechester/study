package com.study.spring.aspect;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("seminar-typist.xml")
public class TypistTest {
    @Autowired
    @Qualifier("xin")
    private Member xin;
    
    @Autowired
    private Typist typist;
    
    @Autowired
    @Qualifier("chapter3")
    private Slides chapter3;

    @Test
    public void typistShouldHaveSlides() {
        xin.presents(chapter3);
        assertTrue(typist.getBook().contains(chapter3));
    }
}
