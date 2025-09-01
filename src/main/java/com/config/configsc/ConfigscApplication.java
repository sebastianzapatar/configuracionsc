package com.config.configsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigscApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigscApplication.class, args);
    }

}
