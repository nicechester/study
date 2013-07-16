package com.study.spring.jsrinjection;

import static org.junit.Assert.*;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("seminar.xml")
public class SeminarConfigTest {
    @Resource private Member xin;
    @Resource private Member greg;
    @Resource private Slide aop;
    @Resource private Slide injection;
    
    @Test
    public void xinShouldPresentAop() {
        xin.presents();
        assertEquals(aop, xin.getSlide());
    }
    
    @Test
    public void gregShouldPresentInjection() {
        greg.presents();
        assertEquals(injection, greg.getSlide());
    }
}
