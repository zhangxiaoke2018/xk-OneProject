package com.xk.springcloud.Service;

import com.xk.springcloud.Entity.Student;

import java.util.List;

public interface StudentService {

    /**
     * 添加或者修改学生信息
     * @param student
     */
    public void save(Student student);

    /**
     * 根据id查找学生信息
     * @param id
     * @return
     */
    public Student findById(Integer id);

    /**
     * 查询学生信息
     * @return
     */
    public List<Student> list();

    /**
     * 根据id删除学生信息
     * @param id
     */
    public void delete(Integer id);
}
