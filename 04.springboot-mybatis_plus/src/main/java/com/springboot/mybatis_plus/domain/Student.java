package com.springboot.mybatis_plus.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 3072 kB
 * </p>
 *
 * @author houwenzhen
 * @since 2020-06-11
 */
@TableName("student")
public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_id", type = IdType.AUTO)
    private Integer studentId;
    private String name;
    private String age;
    private String sex;


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    protected Serializable pkVal() {
        return this.studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
        ", studentId=" + studentId +
        ", name=" + name +
        ", age=" + age +
        ", sex=" + sex +
        "}";
    }
}
