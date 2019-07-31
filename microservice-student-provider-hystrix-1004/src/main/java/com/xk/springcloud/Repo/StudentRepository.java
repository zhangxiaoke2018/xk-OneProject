package com.xk.springcloud.Repo;

import com.xk.springcloud.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepository extends JpaRepository<Student, Integer>,JpaSpecificationExecutor<Student> {

}
