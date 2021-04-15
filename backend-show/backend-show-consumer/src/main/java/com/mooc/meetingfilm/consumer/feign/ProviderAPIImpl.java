package com.mooc.meetingfilm.consumer.feign;

import org.springframework.stereotype.Service;

/**
 * @author by 完善者
 * @date 2021/4/10 14:30
 * @DESC
 */

@Service
public class ProviderAPIImpl implements ProviderApi{
    @Override
    public String invokeProviderController(String message) {
        return null;
    }
}
