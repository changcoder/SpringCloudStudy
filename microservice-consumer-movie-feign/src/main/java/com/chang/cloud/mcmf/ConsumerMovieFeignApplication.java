package com.chang.cloud.mcmf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConsumerMovieFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieFeignApplication.class, args);
    }
}
