package com.mooc.meetingfilm.consumer.service.impl;

import com.mooc.meetingfilm.consumer.service.ConsumerServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author by 完善者
 * @date 2021/3/7 13:10
 * @DESC
 */
@Service
public class ConsumerServiceImpl implements ConsumerServiceAPI {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient eurekaClient;

    @Override
    public String sayHello(String message) {
//        String hostname = "localhost";
//        int port = 7101;
//        String uri = "/provider/sayhello?message=" + message;
//        //http://localhost:7101/provider/sayhello?message=hello

        ServiceInstance choose = eurekaClient.choose("hello-service-provider");
        String hostname = choose.getHost();
        int port = choose.getPort();
        String uri = "/provider/sayhello?message=" + message;
        String url = "http://" + hostname + ":" + port + uri;

        //invoker provider test
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }
}
