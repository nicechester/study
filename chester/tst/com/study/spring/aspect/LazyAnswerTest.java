package com.study.spring.aspect;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("seminar-questions.xml")
public class LazyAnswerTest {
    @Autowired
    @Qualifier("xin")
    private Member xin;
        
    @Autowired
    @Qualifier("chapter3")
    private Slides chapter3;

    @Test
    public void xinShouldAnswerQuestions() {
        xin.presents(chapter3);
        String question="What is your understanding level of AOP?";
        String answer=((QuestionsAware)xin).answer(question);
        System.out.println("[audience] Question: "+question);
        System.out.println(String.format("[%s] Answer: %s", xin.getName(), answer));
        assertTrue(answer.contains(question));
    }
}
