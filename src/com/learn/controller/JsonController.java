package com.learn.controller;

import com.learn.bean.Employee;
import com.learn.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/24 10:51<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Controller
public class JsonController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/testJson")
    @ResponseBody
    public Collection<Employee> testJson(){
        Collection<Employee> employees = employeeDao.getAll();
        return employees;
    }

    @RequestMapping(value = "/testJson2")
    @ResponseBody
    public Map<String,Object> testJson2(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("李佳乐","java");
        map.put("赵坤","python");
        map.put("郑少伟","c++");
        map.put("钱昌松","c#");
        return map;
    }
}
