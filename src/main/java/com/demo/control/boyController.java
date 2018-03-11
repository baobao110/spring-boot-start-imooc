package com.demo.control;

import com.demo.domain.boy;
import com.demo.resporities.Resporsity;
import com.demo.service.boyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class boyController {

    @Autowired
    private Resporsity restore;

    @Autowired
    private boyService b;

    /*
    * 查询数据库内容
    */
    @GetMapping(value = "/boy")
    public List<boy>boyList(){
            return restore.findAll();
    }
    /*
    * 向数据库添加数据
    */
    @GetMapping(value = "/add")
    public  boy boyAdd(@RequestParam("age") Integer age,@RequestParam("name") String name){
        boy b=new boy();
        b.setAge(age);
        b.setName(name);
       return  restore.save(b);
    }

    /*
    * 数据库查找单条信息
    */
    @GetMapping(value = "/find")
    public Optional<boy> find(@RequestParam("id") Integer id){
        return restore.findById(id);
    }
    //注意这里的更新方法和添加方法相同，如果数据库中有就更新，没有就添加
    @GetMapping(value = "/update")
    public boy update(@RequestParam("id") Integer id,@RequestParam("age") Integer age,@RequestParam("name") String name){
        boy b=new boy();
        b.setId(id);
        b.setName(name);
        b.setAge(age);
       return  restore.save(b);
    }

    //删除数据库的记录
    @RequestMapping(value = "/delete")
    public void delete(@RequestParam("id") Integer id){
        restore.deleteById(id);
    }

    //自定义的方法
    @RequestMapping(value = "/findByAge")
    public List<boy> finddByAge(@RequestParam("age") Integer age){
        return restore.findByAge(age);
    }

    @RequestMapping(value = "/insertMore")
    public void insertMore(){
        b.insertMore();
    }

}
