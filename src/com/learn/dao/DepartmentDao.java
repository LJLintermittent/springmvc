package com.learn.dao;

import com.learn.bean.Department;
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
public class DepartmentDao {
    private static Map<Integer, Department> departments = null;
    static {
        departments = new HashMap<Integer, Department>();
        departments.put(101,new Department(101,"开发部"));
        departments.put(102,new Department(102,"测试部"));
        departments.put(103,new Department(103,"产品部"));
        departments.put(104,new Department(104,"运维部"));
        departments.put(105,new Department(105,"人事部"));
    }

    public Collection<Department> getDepartments(){
        return departments.values();
    }

    public Department getDepartment(Integer id){
        return departments.get(id);
    }

}
