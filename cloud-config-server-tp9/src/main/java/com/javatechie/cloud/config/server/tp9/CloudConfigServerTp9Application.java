package com.javatechie.cloud.config.server.tp9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerTp9Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServerTp9Application.class, args);
    }

}
