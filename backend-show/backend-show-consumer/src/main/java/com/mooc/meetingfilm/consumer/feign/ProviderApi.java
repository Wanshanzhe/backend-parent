package com.mooc.meetingfilm.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author by 完善者
 * @date 2021/3/21 12:49
 * @DESC
 */

@FeignClient(name = "hello-service-provider",
        path = "/provider",
//        fallback = ProviderFallbackAPIImpl.class,
        fallbackFactory = FallbackAPIFactory.class
//        url = "http://localhost:7101"
)
public interface ProviderApi {

    @RequestMapping(value = "/sayhello",method = RequestMethod.GET)
    String invokeProviderController(@RequestParam("message") String message);

//    @RequestMapping(value = "/{providerId}/sayhello",method = RequestMethod.POST)
//    String providerTest(@RequestHeader("author")String author,
//                                    @PathVariable("providerId") String providerId,
//                                    @RequestBody UserModel userModel);

}
