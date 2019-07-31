package com.xk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class StudentProviderApplication_1002
{
    public static void main( String[] args )
    {
        SpringApplication.run(StudentProviderApplication_1002.class, args);
    }
}
