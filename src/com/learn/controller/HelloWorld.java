package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/21 20:05<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Controller
public class HelloWorld {
    @RequestMapping(value = "/demo1"
            /*method = RequestMethod.GET,
            params = {"username"},
            headers = {}*/)
    public String test1(){
        System.out.println("hello world!");
        return "1";
    }

    @RequestMapping(value = "/demo2",method = RequestMethod.POST)
    public String test2(){
        return "2";
    }

    @RequestMapping("/testRest/{id}/{username}" )
    public String testRest(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("id="+id+",username="+username);
        return "3";
    }
}
