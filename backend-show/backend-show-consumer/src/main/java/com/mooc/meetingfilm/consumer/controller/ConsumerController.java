package com.mooc.meetingfilm.consumer.controller;

import com.mooc.meetingfilm.consumer.service.ConsumerServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by 完善者
 * @date 2021/3/7 13:11
 * @DESC
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerServiceAPI consumerServiceAPI;

    @RequestMapping(value = "/sayhello")
    public String sayHello(String message) {
        return consumerServiceAPI.sayHello(message);
    }

}
