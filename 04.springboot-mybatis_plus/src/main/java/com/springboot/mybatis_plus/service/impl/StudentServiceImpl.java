package com.springboot.mybatis_plus.service.impl;

import com.springboot.mybatis_plus.domain.Student;
import com.springboot.mybatis_plus.dao.StudentMapper;
import com.springboot.mybatis_plus.service.StudentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 3072 kB 服务实现类
 * </p>
 *
 * @author houwenzhen
 * @since 2020-06-11
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
