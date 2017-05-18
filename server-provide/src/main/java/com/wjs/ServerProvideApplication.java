package com.wjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;




@EnableDiscoveryClient
@SpringBootApplication
public class ServerProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerProvideApplication.class, args);
    }
}
