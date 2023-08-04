package edu.jespinoza.spring.eureka.client.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ToString
@ConfigurationProperties("app.service.payment")
public class AppServicePaymentProperties {
    private String url;
}
