package com.mooc.meetingfilm.hall.controller.vo;

import lombok.Data;

/**
 * @author by 完善者
 * @date 2021/3/13 8:55
 * @DESC
 */

@Data
public class HallsRespVO {

    private String cinemaName;
    private String hallName;
    private String filmName;
    private String hallTypeName;
    private String beginTime;
    private String endTime;
    private String filmPrice;
}
