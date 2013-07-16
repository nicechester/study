package com.study.spring.jsrinjection;

public class Slide {
    private final String subject, contents;
    public Slide(String subject, String contents) {
        this.subject = subject;
        this.contents = contents;
    }
    
    public String getSubject() { return subject; }
    public String getContents() { return contents; }
}
