package com.mooc.meetingfilm.backend.common.backend.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.meetingfilm.backend.common.BackendCommonApplicationTests;
import com.mooc.meetingfilm.backend.common.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.backend.common.dao.mapper.MoocBackendUserTMapper;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author by 完善者
 * @date 2021/3/6 14:33
 * @DESC
 */
public class UserTest extends BackendCommonApplicationTests {

    @Resource
    private MoocBackendUserTMapper moocBackendUserTMapper;

    @Test
    public void add(){
        MoocBackendUserT user = new MoocBackendUserT();
        user.setUserName("admin");
        user.setUserPwd("admin");
        user.setUserPhone("13112341234");
        moocBackendUserTMapper.insert(user);
    }


    @Test
    public void select(){
//        //根据主键查询
//        MoocBackendUserT moocBackendUserT = moocBackendUserTMapper.selectById(2);
//        System.out.println(moocBackendUserT);
//        //查询列表
//        List<MoocBackendUserT> list = moocBackendUserTMapper.selectList(null);
//        list.stream().forEach(System.out::println);
        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.eq("user_name","admin");
        wrapper.like("user_name","d");
        List<MoocBackendUserT> list = moocBackendUserTMapper.selectList(wrapper);
        list.stream().forEach(System.out::println);

    }

    @Test
    public void selectByPage(){
        //分页对象
        Page<MoocBackendUserT> page = new Page<>(1,10);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.like("user_name","admin");
        IPage<MoocBackendUserT> iPage = moocBackendUserTMapper.selectPage(page, wrapper);
        List<MoocBackendUserT> list = iPage.getRecords();
        list.stream().forEach(System.out::println);
    }

    @Test
    public void desribeUser(){
        MoocBackendUserT userT = moocBackendUserTMapper.desribeUserByUserName("admin");
        System.out.println(userT);
    }




    @Test
    public void update(){

    }


    @Test
    public void delete(){

    }
}
