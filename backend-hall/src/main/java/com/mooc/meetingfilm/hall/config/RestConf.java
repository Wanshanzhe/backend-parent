package com.mooc.meetingfilm.hall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author by 完善者
 * @date 2021/3/13 18:29
 * @DESC
 */
@Configuration
public class RestConf {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
