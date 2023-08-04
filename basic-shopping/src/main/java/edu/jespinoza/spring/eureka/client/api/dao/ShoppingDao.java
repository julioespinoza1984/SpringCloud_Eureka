package edu.jespinoza.spring.eureka.client.api.dao;

import edu.jespinoza.spring.eureka.client.exception.TechnicalException;

public interface ShoppingDao {
    String getValue(int price) throws TechnicalException;
}
