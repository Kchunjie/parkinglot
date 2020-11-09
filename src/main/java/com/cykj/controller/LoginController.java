package com.cykj.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login()
    {
        System.out.println("前往登录页面");
        System.out.println("前往登录页面");
        System.out.println("前往登录页面");
        return "front_login";
    }
}
