package edu.jespinoza.spring.eureka.client.api.dao.impl;

import edu.jespinoza.spring.eureka.client.api.dao.ShoppingDao;
import edu.jespinoza.spring.eureka.client.exception.TechnicalException;
import edu.jespinoza.spring.eureka.client.properties.AppServicePaymentProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Repository("shoppingDao")
@RequiredArgsConstructor
@Slf4j
public class ShoppingDaoImpl implements ShoppingDao {
    private final AppServicePaymentProperties appServicePaymentProperties;
    private final RestTemplate restTemplate;

    @Override
    public String getValue(int price) throws TechnicalException {
        log.info("getValue({})", price);
        String url = appServicePaymentProperties.getUrl() + price;
        log.info("url -> {}", url);
        try {
            return restTemplate.getForObject(url, String.class);
        } catch (RestClientException e) {
            throw new TechnicalException(e.getMessage(), e);
        }
    }
}
