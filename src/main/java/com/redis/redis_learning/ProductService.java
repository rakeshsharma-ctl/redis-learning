package com.redis.redis_learning;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Cacheable(value = "products", key = "#id")
    public String getProductById(String id) {
        simulateSlowService();
        return "Product_" + id;
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000); // simulate delay
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
