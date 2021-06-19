package com.learn.controller;

import com.learn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/22 16:46<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Controller
public class SelectController {

    @RequestMapping(value = "/select")
    public String selectByList(Map<String,Object> map){
        ArrayList<Object> list = new ArrayList<>();
        list.add(new User("李佳乐","123456","男",20));
        list.add(new User("赵坤","222222","男",20));
        list.add(new User("杨涛","333333","男",20));
        list.add(new User("郑少伟","444444","男",20));
        list.add(new User("钱昌松","555555","男",20));
        list.add(new User("张嘉豪","666666","男",20));
        map.put("allUser",list);
        for (Object o : list) {
            System.out.println(o);
        }
        return "list";
    }
}
