package com.mooc.meetingfilm.hall.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mooc.meetingfilm.hall.controller.vo.HallSaveReqVO;
import com.mooc.meetingfilm.hall.controller.vo.HallsReqVO;
import com.mooc.meetingfilm.hall.controller.vo.HallsRespVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;

/**
 * @author by 完善者
 * @date 2021/3/11 17:49
 * @DESC
 */
public interface HallServiceAPI {

    // 获取全部播放厅接口
    IPage<HallsRespVO> describeHalls(HallsReqVO hallsReqVO) throws CommonServiceException;

    // 保存影厅信息
    void saveHall(HallSaveReqVO hallSaveReqVO) throws CommonServiceException;
}
