package com.tw.ansibledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnsibleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnsibleDemoApplication.class, args);
        System.out.println("=======================");
        System.out.println("Hello World Started!");
        System.out.println("=======================");
    }
}
