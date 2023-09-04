package com.robotlab.blog.service.user.service.user;

import com.robotlab.blog.api.model.vo.user.dto.BaseUserInfoDTO;
import com.robotlab.blog.service.user.repository.dao.UserDao;
import com.robotlab.blog.service.user.repository.entity.UserDO;
import com.robotlab.blog.service.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 2023/7/20
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserDO getWxUser(String wxuuid) {
        return userDao.getByThirdAccountId(wxuuid);
    }

    @Override
    public BaseUserInfoDTO passwordLogin(String userName, String password) {
        return null;
    }
}
