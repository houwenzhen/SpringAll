package com.springboot.springbootmybatis.domain;

import lombok.Data;

/**
 * @author houwenzhen
 * @version 1.0
 * @date 2020/5/24 11:23
 * @descriptio
 */

@Data
public class User {
    private Integer id;
    private String name;
    private String username;
    private String date;
    private String password;
}
