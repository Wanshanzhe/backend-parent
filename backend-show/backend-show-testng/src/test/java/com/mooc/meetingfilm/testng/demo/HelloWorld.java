package com.mooc.meetingfilm.testng.demo;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;


/**
 * @author by 完善者
 * @date 2021/4/13 10:54
 * @DESC
 */
@Slf4j
public class HelloWorld {

    @Test
    public void test(){
        log.error("this is test!");
    }

    @BeforeMethod
    public void BeforeMethod(){
        log.info("this is BeforeMethod test!");
    }

    @AfterMethod
    public void AfterMethod(){
        log.info("this is AfterMethod test!");
    }

    @BeforeClass
    public static void BeforeClass(){
        log.info("this is BeforeClass test!");
    }

    @AfterClass
    public static void AfterClass(){
        log.info("this is AfterClass test!");
    }

    @BeforeSuite
    public void BeforeSuite(){
        log.info("this is BeforeSuite test!");
    }

    @AfterSuite
    public void AfterSuite(){
        log.info("this is AfterSuite test!");
    }
}
