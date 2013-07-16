package com.study.spring.aspect;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("chapter4")
public class Chapter4Slides implements Slides{

    public String getSubject() { return "Chapter 4. Aspect Oriented Spring"; }

    public String getContents() { return "AOP is awesome!\nYou can do annotation in java."; }

}
