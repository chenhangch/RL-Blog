package com.github.pai.api.model.vo.user.dto;

import com.github.pai.api.model.entity.BaseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 2023/7/20
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("用户基础实体对象")
@Accessors(chain = true)
public class BaseUserInfoDTO extends BaseDTO {

    @ApiModelProperty(value = "用户id", required = true)
    private Long userId;

    @ApiModelProperty(value = "用户名", required = true)
    private String userName;

    @ApiModelProperty(value = "角色", example = "ADMIN|NORMAL")
    private String role;

    @ApiModelProperty(value = "用户头像")
    private String photo;

    @ApiModelProperty(value = "用户简介")
    private String profile;

    @ApiModelProperty(value = "个人职位")
    private String position;

    @ApiModelProperty(value = "公司")
    private String company;

    @ApiModelProperty(hidden = true)
    private String extend;

    @ApiModelProperty(value = "用户是否被删除", hidden = true)
    private Integer deleted;

    @ApiModelProperty(value = "最后登录的地理位置")
    private String region;

}
