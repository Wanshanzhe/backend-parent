package com.mooc.meetingfilm.film.controller.vo;

import lombok.Data;

/**
 * @author by 完善者
 * @date 2021/3/7 16:37
 * @DESC 查询影片列表接口
 */
@Data
public class DescribeFilmsRespVO {

        private String filmId;
        private String  filmStatus;
        private String filmName;
        private String filmEnName;
        private String filmScore;
        private String preSaleNum;
        private String boxOffice;
        private String filmTime;
        private String filmLength;
        private String mainImg;
}
