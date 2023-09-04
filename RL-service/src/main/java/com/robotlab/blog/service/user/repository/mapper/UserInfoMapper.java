package com.robotlab.blog.service.user.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.robotlab.blog.service.user.repository.entity.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 2023/7/20
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfoDO> {
}
