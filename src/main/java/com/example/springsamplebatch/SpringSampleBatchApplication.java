package com.example.springsamplebatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSampleBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSampleBatchApplication.class, args);
    }

}
