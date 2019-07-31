package com.xk.springcloud.Controller;

import com.xk.springcloud.Entity.Student;
import com.xk.springcloud.Service.StudentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * @author zhangxiaoke
 *
 */
@RestController
@RequestMapping("/student")
public class StudentConsumerController {
    @Autowired
    private StudentClientService studentClientService;

    //private static final String PRE_TAB="http://localhost:1001";
    private static final String PRE_TAB="http://MICROSERVICE-STUDENT";

    /**
     * 添加或者修改学生信息
     * @param student
     * @return
     */
    @PostMapping(value="/save")
    private boolean save(@RequestBody Student student){
        return studentClientService.save(student);
    }

    /**
     * 查询学生信息
     * @return
     */
    @SuppressWarnings("unchecked")
    @GetMapping(value="/list")
    public List<Student> list(){
        return studentClientService.list();
    }

    /**
     * 根据id查询学生信息
     * @return
     */
    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return studentClientService.get(id);
    }

    /**
     * 根据id删除学生信息
     * @return
     */
    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return studentClientService.delete(id);
    }


}
