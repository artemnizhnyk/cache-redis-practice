package com.artemnizhnyk.cacheredispractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CacheRedisPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheRedisPracticeApplication.class, args);
    }

}
