package com.xc.justforjoy.controller;

import com.xc.justforjoy.dao.DepartmentDao;
import com.xc.justforjoy.dao.EmployeeDao;
import com.xc.justforjoy.entity.Department;
import com.xc.justforjoy.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    //查询所有员工返回列表页面
    @GetMapping("emps")
    public String list(Model model){

        Collection<Employee> emps = employeeDao.getAll();
        //放在请求域中
        model.addAttribute("emps",emps);

        //thymeleaf默认会拼串
        //classpath:/templates/*.html
        return "emp/list";
    }

    //来到员工添加页面
    //SpringMVC自动将请求参数和入参对象的属性进行一一绑定，要求请求参数的名字和JavaBean入参的对象里面的属性名是一样的
    @GetMapping("/emp")
    public String toAddPage(Model model){
        //来到添加页面，查出所有的部门，在页面显示
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    //添加员工
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        //来到员工列表页面
        System.out.println("保存员工的信息："+employee);
        //保存员工
        employeeDao.save(employee);
        //redirect:表示重定向到一个地址 /代表当前项目路径
        //forword:表示转发到一个地址
        return "redirect:/emps";
    }


    //来到修改页面
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);

        //页面要显示所有的部门列表
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        //回到修改页面（add.html 是一个修改、添加二合一的页面）

        return "emp/add";
    }

    //修改员工：需要提交员工id
    @PutMapping("/emp")
    public String updateEmp(Employee employee){
        System.out.println("修改的员工数据："+employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    //删除员工
    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
