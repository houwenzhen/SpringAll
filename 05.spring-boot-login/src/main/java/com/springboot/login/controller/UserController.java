package com.springboot.login.controller;


import com.springboot.login.domain.User;
import com.springboot.login.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * InnoDB free: 3072 kB 前端控制器
 * </p>
 *
 * @author houwenzhen
 * @since 2020-06-13
 */
@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @RequestMapping("/")
    public String login() {
        return "login";
    }

    @RequestMapping("/login")
    public String doLogin(String username, String password, Model model) {
        System.out.println(username+","+password);
        if (userService.checkAccount(new User().setUsername(username).setPassword(password))) {
            return "success";
        }
        model.addAttribute("msg","账号or密码ERROR");
        return "login";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/doRegister")
    public String register(User user,Model model) {

        if (!userService.checkAccountByUsername(user.getUsername())) {
            model.addAttribute("msg", "账号已存在");
            return "register";
        }


        if (userService.insert(user)){
            model.addAttribute("register", "注册成功");
        }else {
            model.addAttribute("msg", "注册失败");
        }


        return "register";
    }
}