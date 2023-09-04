package com.robotlab.blog.service.user.service;

import com.robotlab.blog.api.model.vo.user.dto.BaseUserInfoDTO;
import com.robotlab.blog.service.user.repository.entity.UserDO;


/**
 * UserService 用户接口
 * 2023/7/20
 */
public interface UserService {

    UserDO getWxUser(String wxuuid);

    BaseUserInfoDTO passwordLogin(String userName, String password);
}
