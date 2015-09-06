package org.braidner.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Braidner on 9/5/2015.
 */
@Controller
public class AppController {

    @RequestMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping({"/hello"})
    public String hello() {
        return "hello";
    }
}
