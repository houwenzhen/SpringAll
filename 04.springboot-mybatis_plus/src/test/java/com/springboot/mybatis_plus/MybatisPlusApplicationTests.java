package com.springboot.mybatis_plus;

import com.springboot.mybatis_plus.dao.UserMapper;
import com.springboot.mybatis_plus.domain.User;
import com.springboot.mybatis_plus.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {
@Autowired
    UserMapper userMapper;
@Autowired
    UserServiceImpl userService;

    @Test
    void contextLoads() {
//        List<User> all = userMapper.findAll();
//        System.out.println(all);
        User user = userService.selectById(1);
        userService.updateById(new User().setId(1).setName("酷酷哒侯雯浈"));
        List<User> users = userService.selectList(null);
        User user1 = new User();
        user1.setName("");
        userService.insert(user1);
        System.out.println(users);

    }
    @Test
     void a(){
        List<User> users = userService.selectList(null);
        userService.selectById(null);
        System.out.println(users);
    }

}
