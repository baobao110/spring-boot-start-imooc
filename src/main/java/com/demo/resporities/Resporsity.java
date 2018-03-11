package com.demo.resporities;

import com.demo.domain.boy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Resporsity extends JpaRepository<boy ,Integer>{
    public List<boy> findByAge(Integer age);//这是JpaRepository没有的方法是自己写的,不需要写方法体
}
//注意这里的 JpaRepository数据分别为类和主键的类型,见Controller