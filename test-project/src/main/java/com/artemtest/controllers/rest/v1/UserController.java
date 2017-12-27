package com.artemtest.controllers.rest.v1;

import com.artemtest.entities.User;
import com.artemtest.services.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends BaseController{

    @Autowired
    private UserSerivce userSerivce;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public User getUser()  {
        return userSerivce.getUser();
    }
}
