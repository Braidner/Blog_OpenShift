package org.braidner.blog.controller.rest;

import org.braidner.blog.entity.User;
import org.braidner.blog.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Braidner on 9/5/2015.
 */
@RestController
@RequestMapping("security")
public class SecurityController {

    @Autowired
    private SecurityService securityService;

    @RequestMapping("login")
    public String login() {
        if (securityService.isLogined()) {
            return null;
        }
        return null;
    }

    @RequestMapping("logout")
    public String logout() {
        return null;
    }

    @RequestMapping("test")
    public User createUser() {
        return securityService.test();
    }
}
