package edu.jespinoza.spring.eureka.client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebClientConfig {
    @LoadBalanced
    @Bean(name = "restTemplate")
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
