package com.svnandgit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
@SpringBootApplication
public class SvnandgitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SvnandgitApplication.class, args);
    }

}
