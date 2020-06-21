package com.springboot.login.service;

import com.springboot.login.domain.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * InnoDB free: 3072 kB 服务类
 * </p>
 *
 * @author houwenzhen
 * @since 2020-06-13
 */
public interface UserService extends IService<User> {
    boolean checkAccount(User user);
    Boolean checkAccountByUsername(String username);
}
