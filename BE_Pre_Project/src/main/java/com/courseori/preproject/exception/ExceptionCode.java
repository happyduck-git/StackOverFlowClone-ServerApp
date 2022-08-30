package com.courseori.preproject.exception;

import lombok.Getter;

@Getter
public enum ExceptionCode {

    USER_NOT_FOUND(404, "등록되지 않은 유저입니다."),
    QUESTION_NOT_FOUND(404, "등록되지 않은 게시글입니다.");


    private int status;
    private String message;

    ExceptionCode(int status, String message) {
        this.status = status;
        this.message = message;
    }


}
