package com.study.spring.aspect;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.spring.aspect.Member;
import com.study.spring.aspect.Slides;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("seminar-around.xml")
public class MemberTest {
  @Autowired
  @Qualifier("xin")
  private Member xin;
  
  @Autowired
  @Qualifier("greg")
  private Member greg;

  @Test
  public void xinShouldWireWithAutowire() {
    xin.presents();
    assertNotNull(xin.getSlides());
  }
  
  @Test
  public void gregShouldWireWithAutowire() {
    greg.presents();
    assertNotNull(greg.getSlides());
  }
  
  @Autowired
  @Qualifier("chapter3")
  private Slides chapter3;
  
  @Test
  public void xinCanPresentAnyTopic() {
      xin.presents(chapter3);
  }
  
  @Test(expected=RuntimeException.class)
  public void gregIsNotReadyForUnknownTopic() {
      greg.presents(chapter3);
  }
}
