package com.robotlab.blog.api.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * 2023/7/20
 */
@Data
public class BaseDO {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Date createTime;
    private Date updateTime;
}
