package com.mooc.meetingfilm.testng.demo;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @author by 完善者
 * @date 2021/4/13 11:16
 * @DESC
 */
@Slf4j
public class ReportTest {

    @Test
    public void rt1(){
        log.error("ReportTest rt1");
    }

    @Test
    public void rt2(){
        int i= 6 / 0;
        log.error("ReportTest rt1");
    }
}
