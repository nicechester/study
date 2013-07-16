package com.study.spring.aspectj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.spring.aspect.Chapter3Slides;
import com.study.spring.aspect.Chapter4Slides;
import com.study.spring.aspect.Greg;
import com.study.spring.aspect.Member;
import com.study.spring.aspect.Slides;
import com.study.spring.aspect.Xin;

@Configuration
public class SeminarConfig {
    @Bean public Slides chapter3() { return new Chapter3Slides(); }
    @Bean public Slides chapter4() { return new Chapter4Slides(); }
    
    @Bean public Member xin() { return new Xin(); }
    @Bean public Member greg() { return new Greg(); }
}
