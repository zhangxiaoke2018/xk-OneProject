package com.xk.springcloud.Config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringCloudConfig {
    /**
     * 调用服务模版
     * @return
     */
    @Bean
    @LoadBalanced //负载均衡配置
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    /**
     * 自定义轮询算法
     * @return
     */
    @Bean
    public IRule myRule(){
        return new RetryRule();
    }
}
