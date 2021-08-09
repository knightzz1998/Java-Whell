package cn.knightzz.javaexcel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author 王天赐
 * @title: Teacher
 * @projectName Java-Whell
 * @description: TODO
 * @date 2021/8/9 14:24
 */
@Data
public class Teacher {

    @ExcelProperty
    private String name;
    private int age;
    private String email;
}
