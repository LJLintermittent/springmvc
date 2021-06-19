package com.learn.controller;

import com.learn.bean.Department;
import com.learn.bean.Employee;
import com.learn.dao.DepartmentDao;
import com.learn.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.Map;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/23 15:34<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Controller
public class EmpController {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;
    @RequestMapping(value = "/emps")
    public String getAll(Map<String,Object> map){
        Collection<Employee> emps = employeeDao.getAll();
        map.put("emps",emps);
        return "CRUD";
    }

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String toadd(Map<String,Object> map){
        Collection<Department> depts = departmentDao.getDepartments();
        map.put("depts",depts);
        return "add";
    }

    @RequestMapping(value ="/emp",method = RequestMethod.POST)
    public String addEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @RequestMapping(value ="/emp/{id}",method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id") Integer id,Map<String,Object> map){
        Employee emp = employeeDao.get(id);
        Collection<Department> depts = departmentDao.getDepartments();
        map.put("depts",depts);
        map.put("emp",emp);
        return "update";
    }

    @RequestMapping(value ="/emp",method = RequestMethod.PUT)
    public String updateEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @RequestMapping(value ="/emp/{id}",method = RequestMethod.DELETE)
    public String deleteEmp(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }

}
