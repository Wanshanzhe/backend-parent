package com.mooc.meetingfilm.film.controller.vo;

import lombok.Data;

/**
 * @author by 完善者
 * @date 2021/3/7 16:45
 * @DESC 根据主键获取影片信息对象
 */

@Data
public class DescribeFilmRespVO {

    private String filmId;
    private String filmName;
    private String filmLength;
    private String filmCats;
    private String actors;
    private String imgAddress;
    private String subAddress;

}
