package com.github.pai.service.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pai.api.model.vo.user.dto.BaseUserInfoDTO;
import com.github.pai.service.user.repository.entity.UserDO;


/**
 * UserService 用户接口
 * 2023/7/20
 */
public interface UserService {

    UserDO getWxUser(String wxuuid);

    BaseUserInfoDTO passwordLogin(String userName, String password);
}
