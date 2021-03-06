package com.mooc.meetingfilm.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BackendShowConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendShowConsumerApplication.class, args);
    }

}
