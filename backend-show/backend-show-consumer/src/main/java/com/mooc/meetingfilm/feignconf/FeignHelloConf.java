package com.mooc.meetingfilm.feignconf;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author by 完善者
 * @date 2021/4/10 15:05
 * @DESC
 */

@Configuration
public class FeignHelloConf {

    @Bean
    public Contract contract(){
        return new feign.Contract.Default();
    }
}
