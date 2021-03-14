package com.mooc.meetingfilm.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/provider/sayhello")
    public String providerSayHello(String message) {
        log.info("provider sayhello port:{}，message:{}", port, message);
        return "Provvider sayhello port：" + port + ",message：" + message;
    }
}
