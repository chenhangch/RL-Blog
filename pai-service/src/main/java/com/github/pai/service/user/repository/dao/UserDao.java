package com.github.pai.service.user.repository.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pai.service.user.repository.entity.UserDO;
import com.github.pai.service.user.repository.entity.UserInfoDO;
import com.github.pai.service.user.repository.mapper.UserInfoMapper;
import com.github.pai.service.user.repository.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 2023/7/20
 */
@Repository
public class UserDao extends ServiceImpl<UserInfoMapper, UserInfoDO> {
    @Resource
    private UserMapper userMapper;

    /**
     * 根据第三方账号id登录
     *
     * @param accountId
     * @return UserDO
     */
    public UserDO getByThirdAccountId(String accountId) {
        return userMapper.getByThirdAccountId(accountId);
    }
}
