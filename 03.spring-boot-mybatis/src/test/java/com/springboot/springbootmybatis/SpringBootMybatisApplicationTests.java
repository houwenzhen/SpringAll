package com.springboot.springbootmybatis;

import com.springboot.springbootmybatis.dao.UserMapper;
import com.springboot.springbootmybatis.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootMybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void UserMapper_fillAll() {
        List<User> users = userMapper.fineAll();
    }

    @Test
    void UserMapper_update() {
        User user = new User();
        user.setId(1);
        user.setDate("2020.06.02");
        user.setName("admin");
        user.setUsername("你爸比");
        user.setPassword("233333");
        System.out.println(userMapper.updateUser(user));
    }
    @Test
    void UserMapper_delete() {
        System.out.println(userMapper.delUser(1));
    }

    @Test
    void UserMapper_insert() {
        User user = new User();
        user.setDate("2020.06.02");
        user.setName("admin");
        user.setUsername("大头");
        user.setPassword("@hwz_2020");
        int i = userMapper.InsertUser(user);
        System.out.println(i);
    }

}
