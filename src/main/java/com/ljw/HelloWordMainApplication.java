package com.ljw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* @SpringBootApplication来标注一个主程序类，说明这是一个Spring Boot应用
* */
@SpringBootApplication
public class HelloWordMainApplication {
        //Spring应用启动器
        public static void main(String[] args) {
                SpringApplication.run(HelloWordMainApplication.class, args);
        }
}
