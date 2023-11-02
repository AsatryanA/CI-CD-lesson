package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiCdApplication {

    public static void main(String[] args) {
       int a = 1;
        {
            int b = 2+a;

        }



        SpringApplication.run(CiCdApplication.class, args);
    }

}
