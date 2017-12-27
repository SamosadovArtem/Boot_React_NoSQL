package com.artemtest.services.impl;

import com.artemtest.entities.User;
import com.artemtest.services.UserSerivce;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserSerivce{

    @Override
    public User getUser() {
        User defaultUser = new User();
        defaultUser.setId(122L);
        defaultUser.setUsername("test name");
        return defaultUser;
    }
}
