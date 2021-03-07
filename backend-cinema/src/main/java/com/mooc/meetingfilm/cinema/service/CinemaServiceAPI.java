package com.mooc.meetingfilm.cinema.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mooc.meetingfilm.cinema.controller.vo.CinemaSavedReqVO;
import com.mooc.meetingfilm.cinema.controller.vo.DescribeCinemasRespVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;

/**
 * @author by 完善者
 * @date 2021/3/7 22:23
 * @DESC
 */
public interface CinemaServiceAPI {

    //保存影院
    void saveCinema(CinemaSavedReqVO reqVO) throws CommonServiceException;

    //获取影院列表
    IPage<DescribeCinemasRespVO> describeCinemas(int nowPage,int pageSize) throws CommonServiceException;
}
