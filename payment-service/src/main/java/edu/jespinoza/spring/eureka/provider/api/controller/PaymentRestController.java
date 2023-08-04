package edu.jespinoza.spring.eureka.provider.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
@Slf4j
public class PaymentRestController {

    @GetMapping("/payNow/{price}")
    public ResponseEntity<String> payNow(@PathVariable int price) {
        log.info("price -> {}", price);
        String msg = "payment with " + price + " is successfull";
        return ResponseEntity.ok(msg);
    }
}
