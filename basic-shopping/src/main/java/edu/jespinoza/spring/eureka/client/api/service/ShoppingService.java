package edu.jespinoza.spring.eureka.client.api.service;

import edu.jespinoza.spring.eureka.client.exception.TechnicalException;

public interface ShoppingService {
    String getValue(int price) throws TechnicalException;
}
