package com.springboot.login.dao;

import com.springboot.login.domain.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * InnoDB free: 3072 kB Mapper 接口
 * </p>
 *
 * @author houwenzhen
 * @since 2020-06-13
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User>findALL();
    Integer checkAccount(User user);
    Integer checkAccountByUsername(String username);
}
