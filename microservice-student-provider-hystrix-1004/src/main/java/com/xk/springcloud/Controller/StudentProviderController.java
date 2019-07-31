package com.xk.springcloud.Controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xk.springcloud.Entity.Student;
import com.xk.springcloud.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 获取信息
     * @return
     * @throws InterruptedException
     */
    @ResponseBody
    @GetMapping(value="/getInfo")
    @HystrixCommand(fallbackMethod="getInfoFallback")
    public Map<String,Object> getInfo() throws InterruptedException{
        Thread.sleep(100);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code", 200);
        map.put("info", "业务数据xxxxx");
        return map;
    }

    public Map<String,Object> getInfoFallback() throws InterruptedException{
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code", 500);
        map.put("info", "系统出错，稍后重试");
        return map;
    }
}
