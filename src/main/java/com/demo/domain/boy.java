package com.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class boy {
    @Id
    @GeneratedValue
    Integer id;
    Integer age;
    String name;
    char sex;

    public boy() {
    }
}
/*
*注意这里的 @Entity加上这个标签就不用创建数据库运行后会自动创建  @Id @GeneratedValue是确定主键,这里必须要有构造函数
* @Getter  @Setter的作用是无需写get和set方法，这样运行后会自动帮我们生成数据库
*/