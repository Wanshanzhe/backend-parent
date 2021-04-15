package com.mooc.meetingfilm.consumer.controller;

import com.mooc.meetingfilm.consumer.feign.ProviderApi;
import com.mooc.meetingfilm.consumer.service.ConsumerServiceAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author by 完善者
 * @date 2021/3/7 13:11
 * @DESC
 */
@RestController
@Slf4j
public class ConsumerController {

    @Autowired
    private ConsumerServiceAPI consumerServiceAPI;

    @Resource
    private ProviderApi providerApi;

    @RequestMapping(value = "/sayhello")
    public String sayHello(String message) {
        return consumerServiceAPI.sayHello(message);
    }

    @RequestMapping(value = "/sayhello/feign")
    public String sayHelloFeign(String message){
        System.out.println("feign message = " + message);
        return providerApi.invokeProviderController(message);
    }

//    @RequestMapping(value = "/sayhello/post")
//    public String sayHelloFeign(String author, String providerId, UserModel userModel){
//        log.info("author:{}，providerId：{}，userModel：{}",author,providerId,userModel);
//        return providerApi.providerTest(author, providerId, userModel);
//    }

}
