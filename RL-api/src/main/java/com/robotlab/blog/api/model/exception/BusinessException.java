package com.robotlab.blog.api.model.exception;

import com.robotlab.blog.api.model.vo.Status;
import com.robotlab.blog.api.model.vo.contants.StatusEnum;
import lombok.Getter;

/**
 * 异常
 */
@Getter
public class BusinessException extends RuntimeException{
    private Status status;

    public BusinessException(Status status) {
        this.status = status;
    }

    public BusinessException(int code, String msg) {
        this.status = Status.newStatus(code, msg);
    }

    public BusinessException(StatusEnum statusEnum, Object... args) {
        this.status = Status.newStatus(statusEnum, args);
    }
}
