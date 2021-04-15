package com.mooc.meetingfilm.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author by 完善者
 * @date 2021/3/7 13:02
 * @DESC
 */

@Slf4j
@RestController
public class providerController {

    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "/provider/sayhello",method = RequestMethod.GET)
    public String providerSayHello(String message) {
        log.info("provider sayhello port:{}，message:{}", port, message);
        return "Provvider sayhello port：" + port + ",message：" + message;
    }

    @RequestMapping(value = "/provider/{providerId}/sayhello",method = RequestMethod.POST)
    public String postTest(
                @RequestHeader("author")String author,
                @PathVariable("providerId") String providerId,
                @RequestBody String json){

        log.error("provider sayhello port:{}，author:{}，providerId:{}，message:{}",port, author, providerId, json);
        return "Provider sayhello port:" + port + "message:" + json;
    }
}
