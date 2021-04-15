package com.mooc.meetingfilm.consumer.feign;

import org.springframework.stereotype.Service;

/**
 * @author by 完善者
 * @date 2021/4/11 11:57
 * @DESC 降级实现
 */

@Service
public class ProviderFallbackAPIImpl implements ProviderApi{

    @Override
    public String invokeProviderController(String message) {
        return "invokeProviderController fallback message=" + message;
    }

}
