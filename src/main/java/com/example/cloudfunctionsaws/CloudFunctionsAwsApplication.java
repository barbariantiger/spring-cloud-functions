package com.example.cloudfunctionsaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class CloudFunctionsAwsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFunctionsAwsApplication.class, args);
    }

    @Bean
    public Function<String, String> uppercase() {
        return String::toUpperCase;
    }
}
