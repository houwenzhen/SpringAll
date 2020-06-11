package com.springboot.mybatis_plus.dao;

import com.springboot.mybatis_plus.domain.Student;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * InnoDB free: 3072 kB Mapper 接口
 * </p>
 *
 * @author houwenzhen
 * @since 2020-06-11
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
