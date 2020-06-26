package springboot.loger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author houwenzhen
 * @version 1.0
 * @date 2020/6/25 11:07
 * @descriptio
 */

@RestController
public class Index {
    private static final Logger logger = LoggerFactory.getLogger(Index.class);
    @RequestMapping("/info")
    public String info(){
        logger.info("info 日记");
        return "success";
    }
    @RequestMapping("/err")
    public String error(){
        logger.error("error 日记打印");
       return "success";
    }
}
