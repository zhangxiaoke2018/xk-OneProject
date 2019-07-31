package com.xk.springcloud.Controller;


import com.xk.springcloud.Entity.Student;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentProviderController {
    @Resource
    private StudentService studentService;

    /**
     * 添加或者修改学生信息
     * @param student
     * @return
     */
    @PostMapping(value="/save")
    public boolean save(Student student){
        try{
            studentService.save(student);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
     * 查询学生信息
     * @return
     */
    @GetMapping(value="/list")
    public List<Student> list(){
        System.out.println("list--1002");
        return studentService.list();
    }

    /**
     * 根据id查询学生信息
     * @return
     */
    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return studentService.findById(id);
    }

    /**
     * 根据id删除学生信息
     * @return
     */
    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try{
            studentService.delete(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
