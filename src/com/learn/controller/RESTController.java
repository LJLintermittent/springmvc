package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/22 10:46<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Controller
public class RESTController {
    @RequestMapping(value = "/testREST/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("id="+id);
        return "3";
    }

    @RequestMapping(value = "/testREST",method = RequestMethod.PUT)
    @ResponseBody()
    public String updateUser(){
        return "3";
    }

    @RequestMapping(value = "/testAjax_DELETE",method = RequestMethod.DELETE)
    public void testAjax_DELETE(Integer id){
        System.out.println("testAjax_DELETE,id="+id);
    }
}
