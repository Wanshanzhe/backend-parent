package com.mooc.meetingfilm.consumer.ribbon.rules;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.Server;

/**
 * @author by 完善者
 * @date 2021/3/14 10:09
 * @DESC
 */
public class MyRule extends AbstractLoadBalancerRule {

    public MyRule() {

    }

    @Override
    public Server choose(Object o) {
        //灰度发布10%的流量在新的功能 ~ 90%的流量在旧的功能
        //对10%有没有限制，已经访问过新功能的流量不能再访问旧的功能
        // 无论传入什么，都返回null
        return null;
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }
}
