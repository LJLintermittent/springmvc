package com.learn.dao;

import com.learn.bean.Department;
import com.learn.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/23 15:12<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001,new Employee(1001,"李佳乐","1157221853@qq.com",1,new Department(101,"开发部")));
        employees.put(1002,new Employee(1002,"赵坤","zhaokun@qq.com",1,new Department(102,"测试部")));
        employees.put(1003,new Employee(1003,"杨涛","yangtao@qq.com",1,new Department(102,"测试部")));
        employees.put(1004,new Employee(1004,"钱昌松","qianchangsong@qq.com",1,new Department(103,"产品部")));
        employees.put(1005,new Employee(1005,"郑少伟","zhengshaowei@qq.com",1,new Department(104,"运维部")));
        employees.put(1006,new Employee(1006,"张嘉豪","zhangjiahao@qq.com",1,new Department(105,"人事部")));
    }
    private static Integer initId = 1007;
    public void save(Employee employee){
        if(employee.getId() == null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }
    public Collection<Employee> getAll(){
        return employees.values();
    }

    public Employee get(Integer id){
        return employees.get(id);
    }

    public void delete(Integer id){
        employees.remove(id);
    }


}
