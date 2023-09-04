package com.robotlab.blog.api.model.vo.contants;

import lombok.Getter;

/**
 * 目前仅提供两个状态枚举
 * SUCCESS - 0 - OK
 * SOMETHING_ERROR - 999 - ERROR
 *
 * 2023/7/20
 */
@Getter
public enum StatusEnum {
    SUCCESS(0, "OK"),

    SOMETHING_ERROR(999, "ERROR");

    private int code;

    private String msg;

    StatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
