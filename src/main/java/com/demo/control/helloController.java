package com.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
/*
* springboot返回页面时需要在pom文件中添加依赖
*/
@RestController
@RequestMapping("/hello")
public class helloController {

    @RequestMapping(value ={"/hello","/h1"})/*注意这里的请求意思是无论访问/hello还是/h1都会返回同样的页面*/
   public ModelAndView hello(){
    ModelAndView view =new ModelAndView();
       view.setViewName("hello");
       return view;
   }

   @RequestMapping(value = "/h3/{id}")/*注意这里是url中传参数/h3/参数*/
   public String index(@PathVariable("id") Integer id){
       return "id"+id;
   }

   @RequestMapping(value = "/var")
   public String vari(@RequestParam("id") Integer id){
       return "id"+id;
   }/*注意这里的url传参数为/var?id=参数*/
}
/*
* 注意这里用view时返回前端的为html
*这里的@PathVariable和@RequestParam都是获取前端的参数,注意请求url的不同
*/