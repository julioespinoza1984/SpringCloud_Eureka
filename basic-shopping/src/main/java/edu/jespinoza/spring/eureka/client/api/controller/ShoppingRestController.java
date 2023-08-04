package edu.jespinoza.spring.eureka.client.api.controller;

import edu.jespinoza.spring.eureka.client.api.service.ShoppingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("shoppingRestController")
@RequestMapping("/amazon-payment")
@RequiredArgsConstructor
@Slf4j
public class ShoppingRestController {
    private final ShoppingService shoppingService;


    @GetMapping("/{price}")
    public ResponseEntity<String> invokePaymentService(@PathVariable int price) {
        log.info("price -> {}", price);
        String value = shoppingService.getValue(price);
        log.info("value -> {}", value);
        return ResponseEntity.ok(value);
    }
}
