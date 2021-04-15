package com.mooc.meetingfilm.consumer.feign;

import feign.hystrix.FallbackFactory;

/**
 * @author by 完善者
 * @date 2021/4/11 12:16
 * @DESC
 */
public class FallbackAPIFactory implements FallbackFactory {

    @Override
    public ProviderApi create(Throwable throwable) {
        return new ProviderApi() {
            @Override
            public String invokeProviderController(String message) {
                return "invokeProviderController FallbackAPIFactory message=" + message;
            }
        };
    }
}
