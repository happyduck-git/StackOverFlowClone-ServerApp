package com.courseori.preproject.question.filter;

import lombok.Getter;

@Getter
public enum QuestionSort {

    NEWEST("Newest"),
    RECENT_ACTIVITY("Recent activity"),
    HIGHEST_SCORE("Highest score"),
    MOST_FREQUENT("Most frequent"),
    BOUNTY_ENDING_SOON("Bounty ending soon");

    private String sort;

    QuestionSort(String sort) {
        this.sort = sort;
    }

}
