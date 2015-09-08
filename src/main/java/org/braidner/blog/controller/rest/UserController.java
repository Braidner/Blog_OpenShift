package org.braidner.blog.controller.rest;

import org.braidner.blog.entity.User;
import org.braidner.blog.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Braidner on 9/8/2015.
 */
@RestController("user")
public class UserController {

    @Autowired
    private SecurityService securityService;

    @RequestMapping(value = "create", method = RequestMethod.PUT)
    public HttpStatus createUser() {
        User user = new User();
        user.setLogin("Braidner");
        user.setPassword("123");
        user = securityService.createUser(user);
        return user != null ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }
}
