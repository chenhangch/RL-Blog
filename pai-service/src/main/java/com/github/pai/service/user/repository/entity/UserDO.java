package com.github.pai.service.user.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.pai.api.model.entity.BaseDO;
import io.swagger.models.auth.In;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户登录表
 * 2023/7/20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user")
public class UserDO extends BaseDO {

    private static final long serialVersionUID = 1L;

    private String thirdAccountId;

    private Integer loginType;

    private Integer deleted;

    private String userName;

    private String password;

}
