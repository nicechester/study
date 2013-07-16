package com.study.spring.aspect;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("seminar-around.xml")
public class Chairman2Test {
    @Autowired
    @Qualifier("xin")
    private Member xin;

    @Test
    public void xinShouldBePresentedByChairman() {
      xin.presents();
      assertNotNull(xin.getSlides());
    }
    
    @Autowired
    @Qualifier("chapter3")
    private Slides chapter3;

    @Test
    public void xinStillBePresentedByChairman() {
        xin.presents(chapter3);
    }
}
