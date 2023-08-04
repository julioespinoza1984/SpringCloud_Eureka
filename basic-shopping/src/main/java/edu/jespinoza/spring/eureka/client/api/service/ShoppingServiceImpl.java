package edu.jespinoza.spring.eureka.client.api.service;

import edu.jespinoza.spring.eureka.client.api.dao.ShoppingDao;
import edu.jespinoza.spring.eureka.client.exception.TechnicalException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("shoppingService")
@RequiredArgsConstructor
@Slf4j
public class ShoppingServiceImpl implements ShoppingService {
    private final ShoppingDao shoppingDao;

    @Override
    public String getValue(int price) throws TechnicalException {
        log.info("getValue({})", price);
        String value = shoppingDao.getValue(price);
        log.info("value -> {}", value);
        return value;
    }
}
