package com.robotlab.blog.api.model.vo;

import com.robotlab.blog.api.model.vo.contants.StatusEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 2023/7/19
 */
@Data
@NoArgsConstructor
public class ResVo<T> implements Serializable {
    private static final long serialVersionUID = - 510306209659393854L;

    @ApiModelProperty(value = "返回结果说明", required = true)
    private Status status;

    @ApiModelProperty(value = "返回的实体结果", required = true)
    private T data;

    public ResVo(Status status) {
        this.status = status;
    }

    private ResVo(T t) {
        this.status = Status.newStatus(StatusEnum.SUCCESS);
        this.data = t;
    }

    public static <T> ResVo<T> ok(T t) {
        return new ResVo<T>(t);
    }

    public static <T> ResVo<T> fail(Status status) {
        return new ResVo<>(status);
    }

}
