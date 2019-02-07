package com.example.spring.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class, args);
        System.out.println("注意配置文件的版本号不一样导致的配置方式差别");
        System.out.println("配置好再启动,加入配置注解@EnableConfigServer   http://localhost:8888/first-test.yml");
    }


}

