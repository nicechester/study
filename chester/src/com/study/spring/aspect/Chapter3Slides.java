package com.study.spring.aspect;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("chapter3")
public class Chapter3Slides implements Slides{

    public String getSubject() { return "Chapter 3. Minimizing XML Configuration in Spring"; }

    public String getContents() { return "Don't use XML too much!!!"; }

}
