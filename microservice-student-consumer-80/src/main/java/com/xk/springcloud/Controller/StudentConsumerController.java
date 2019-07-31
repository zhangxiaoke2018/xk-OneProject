package com.xk.springcloud.Controller;

import com.xk.springcloud.Entity.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 *
 * @author zhangxiaoke
 *
 */
@RestController
public class StudentConsumerController {
    @Resource
    private RestTemplate restTemplate;

    //private static final String PRE_TAB="http://localhost:1001";
    private static final String PRE_TAB="http://MICROSERVICE-STUDENT";

    /**
     * 添加或者修改学生信息
     * @param student
     * @return
     */
    @PostMapping(value="/save")
    private boolean save(@RequestBody  Student student){
        return restTemplate.postForObject(PRE_TAB+"/student/save", student, Boolean.class);
    }

    /**
     * 查询学生信息
     * @return
     */
    @SuppressWarnings("unchecked")
    @GetMapping(value="/list")
    public List<Student> list(){
        return restTemplate.getForObject(PRE_TAB+"/student/list", List.class);
    }

    /**
     * 根据id查询学生信息
     * @return
     */
    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return restTemplate.getForObject(PRE_TAB+"/student/get/"+id, Student.class);
    }

    /**
     * 根据id删除学生信息
     * @return
     */
    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try{
            restTemplate.getForObject(PRE_TAB+"/student/delete/"+id, Boolean.class);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
     * 根据id删除学生信息
     * @return
     */
    @SuppressWarnings("unchecked")
    @GetMapping(value="/getInfo")
    @ResponseBody
    public Map<String,Object> getInfo(){
        return restTemplate.getForObject(PRE_TAB+"/student/getInfo/", Map.class);
    }
}
