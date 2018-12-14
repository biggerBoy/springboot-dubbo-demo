package com.yya.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.yya.controller"})
public class AppTestweb{
    public static void main(String[] args) {
        SpringApplication.run(AppTestweb.class);
    }
}
