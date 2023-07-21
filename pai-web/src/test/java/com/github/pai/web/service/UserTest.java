package com.github.pai.web.service;

import com.github.pai.service.user.repository.entity.UserDO;
import com.github.pai.service.user.service.UserService;
import com.github.pai.web.BasicTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 2023/7/21
 */

public class UserTest extends BasicTest {
    @Autowired
    private UserService userService;

    @Test
    public void testSelectAllUser() {
        UserDO wxUser = userService.getWxUser("wx001");
        System.out.println(wxUser);
    }

}
