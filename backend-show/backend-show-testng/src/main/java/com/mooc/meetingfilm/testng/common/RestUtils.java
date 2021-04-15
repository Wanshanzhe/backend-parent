package com.mooc.meetingfilm.testng.common;

import org.springframework.web.client.RestTemplate;

/**
 * @author by 完善者
 * @date 2021/4/13 14:26
 * @DESC
 */
public class RestUtils {

    private static RestTemplate restTemplate;

    public static RestTemplate getRestTemplate(){
        if (restTemplate != null){
            return restTemplate;
        }else{
            restTemplate = new RestTemplate();
            return restTemplate;
        }
    }
}
