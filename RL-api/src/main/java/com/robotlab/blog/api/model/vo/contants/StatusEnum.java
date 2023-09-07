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

    SOMETHING_ERROR(999, "ERROR"),

    // 全局传参异常
    ILLEGAL_ARGUMENTS(100_002_001,"参数异常"),
    ILLEGAL_ARGUMENTS_PRINTF(100_002_002,"参数异常: %s"),

    // 全局权限异常
    FORBID_ERROR(100_403_001, "无权限");

    private final int code;

    private final String msg;

    StatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
