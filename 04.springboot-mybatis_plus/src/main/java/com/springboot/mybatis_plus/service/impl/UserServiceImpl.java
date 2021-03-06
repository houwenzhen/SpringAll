package com.springboot.mybatis_plus.service.impl;

import com.springboot.mybatis_plus.domain.User;
import com.springboot.mybatis_plus.dao.UserMapper;
import com.springboot.mybatis_plus.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 3072 kB 服务实现类
 * </p>
 *
 * @author houwenzhen
 * @since 2020-06-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public User selectById(Serializable id) {
        return super.selectById(id);
    }
}
