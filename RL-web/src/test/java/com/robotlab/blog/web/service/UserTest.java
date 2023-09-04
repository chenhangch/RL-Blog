package com.robotlab.blog.web.service;

import com.robotlab.blog.service.user.repository.entity.UserDO;
import com.robotlab.blog.service.user.service.UserService;
import com.robotlab.blog.web.BasicTest;
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
