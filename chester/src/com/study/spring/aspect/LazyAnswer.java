package com.study.spring.aspect;

public class LazyAnswer implements QuestionsAware {

    public String answer(String question) {
        return String.format("I've got a question as '%s'.\nThe answer will be posted on the bulletin board", question);
    }

}
