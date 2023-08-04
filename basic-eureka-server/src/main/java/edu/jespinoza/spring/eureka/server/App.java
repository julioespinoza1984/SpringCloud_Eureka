package edu.jespinoza.spring.eureka.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext appContext) {
        return args -> {
            String[] beans = appContext.getBeanDefinitionNames();
            Arrays.stream(beans).sorted().forEach(log::info);
        };
    }
}