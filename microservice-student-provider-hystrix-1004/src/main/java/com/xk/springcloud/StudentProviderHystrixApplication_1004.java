package com.xk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class StudentProviderHystrixApplication_1004
{
    public static void main( String[] args )
    {
        SpringApplication.run(StudentProviderHystrixApplication_1004.class,args);
    }
}
