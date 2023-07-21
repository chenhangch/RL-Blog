package com.github.pai.api.model.vo;

import com.github.pai.api.model.vo.contants.StatusEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 2023/7/20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Status {
    @ApiModelProperty(value = "状态码， 0表示返回成功，其他状态表示失败", required = true, example = "0")
    private int code;

    @ApiModelProperty(value = "", required = true, example = "ok")
    private String message;

    public static Status newStatus(int code, String msg) {
        return new Status(code, msg);
    }

    public static Status newStatus(StatusEnum status, Object... msgs) {
        String msg;
        if (msgs.length > 0) {
            msg = String.format(status.getMsg(), msgs);
        } else {
            msg = status.getMsg();
        }
        return newStatus(status.getCode(), msg);
    }
}
