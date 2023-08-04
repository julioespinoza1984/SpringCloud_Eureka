package edu.jespinoza.spring.eureka.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

//    @Bean
//    public CommandLineRunner run(ApplicationContext appContext) {
//        return args -> {
//            String[] beans = appContext.getBeanDefinitionNames();
//            Arrays.stream(beans).sorted().forEach(log::info);
//        };
//    }
}