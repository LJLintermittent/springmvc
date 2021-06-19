package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/23 11:41<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Controller

public class TestController {

    @RequestMapping(value = "/test")
    public String test(String username){
        System.out.println(username);
//        return "redirect:/index.jsp";
        return "4";
    }
    @RequestMapping(value = "/testInterceptor")
    public String testInterceptor(){
        return "4";
    }
    @RequestMapping(value = "/testException",method = RequestMethod.GET)
    public String testException(){
        String s = null;
        System.out.println(s.substring(0,5));
        return "4";
    }

}
