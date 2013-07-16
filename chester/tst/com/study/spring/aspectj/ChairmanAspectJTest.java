package com.study.spring.aspectj;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.spring.aspect.Member;
import com.study.spring.aspect.Slides;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("seminar-java-config.xml")
public class ChairmanAspectJTest {
    @Autowired private Member xin;
    @Autowired private Member greg;
    @Autowired private Slides chapter3;
    @Autowired private Slides chapter4;

    @Test
    public void xinShouldBePresentedByChairman() {
      xin.presents();
      assertNotNull(xin.getSlides());
      assertEquals(chapter4, xin.getSlides());
    }
    
    @Test
    public void gregShouldBePresentedByChairman() {
      greg.presents();
      assertNotNull(greg.getSlides());
      assertEquals(chapter3, greg.getSlides());
    }
    

    @Test
    public void xinStillBePresentedByChairman() {
        xin.presents(chapter3);
    }
}
