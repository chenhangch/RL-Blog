package com.robotlab.blog.service.user.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.robotlab.blog.api.model.entity.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 2023/7/20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "user_info")
public class UserInfoDO extends BaseDO {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private String userName;

    private String photo;


    private String position;

    private String company;

    private String profile;

    private String extend;

    private Integer deleted;

    private Integer userRole;

    // TODO: ip获取
}
