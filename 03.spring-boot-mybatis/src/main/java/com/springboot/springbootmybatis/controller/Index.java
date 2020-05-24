package com.springboot.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author houwenzhen
 * @version 1.0
 * @date 2020/5/24 10:30
 * @descriptio
 */
    @Controller
public class Index {
    /**
     * @Author : houwenzhen
     * @Date : 2020/5/24 10:31
     * @Description : TODO thymeleof 使用
     * @params:
     * @Return :
    */

    @RequestMapping("/")
    public String thymeleaf(Model model, HttpSession session){
        model.addAttribute("msg","Hello thymeleaf");
        session.setAttribute("session","Hello session");
        return "index";
    }
    @RequestMapping("/home")
    public String home(Model model){
        return "home";
    }

}
