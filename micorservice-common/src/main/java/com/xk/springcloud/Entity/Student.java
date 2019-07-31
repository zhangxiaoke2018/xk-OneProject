package com.xk.springcloud.Entity;

import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.io.Serializable;
/**
 *
 *
 *
 *
 * @author zhangxiaoke*/
@Entity
@Data
@Table(name = "t_student")
public class Student  implements Serializable {
    private static final long serialVersionUID = -8626438436320574865L;
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length=50)
    private String name;

    @Column(length=50)
    private String grade;


}
