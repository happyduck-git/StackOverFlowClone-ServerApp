package com.courseori.preproject.question.filter;


import lombok.Getter;

@Getter
public enum QuestionFilter {
    NO_ANSWERS("No answers"),
    NO_ACCEPTED_ANSWER("No accepted answer"),
    HAS_BOUNTY("Has bounty");

    private String filter;

    QuestionFilter(String filter) {
        this.filter = filter;
    }
}
