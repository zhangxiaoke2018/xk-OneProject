package com.xk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author xk
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class StudentProviderApplication_1001
{
    public static void main( String[] args )
    {
        SpringApplication.run(StudentProviderApplication_1001.class, args);
    }
}
