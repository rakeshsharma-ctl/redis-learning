package com.redis.redis_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
// This annotation enables caching support in the application.
public class RedisLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisLearningApplication.class, args);
	}

}
