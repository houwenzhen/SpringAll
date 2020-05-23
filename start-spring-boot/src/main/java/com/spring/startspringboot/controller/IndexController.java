package com.spring.startspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author houwenzhen
 * @version 1.0
 * @date 2020/5/23 12:06
 * @descriptio
 */
@Controller
public class IndexController {
    /**
     * @Author : houwenzhen
     * @Date : 2020/5/23 12:06
     * @Description : TODO
     * @params:
     * @Return :
    */

@RequestMapping("/index")
@ResponseBody
    public String index(){
        return "index.html";
    }
}
