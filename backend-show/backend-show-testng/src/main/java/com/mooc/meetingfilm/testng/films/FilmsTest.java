package com.mooc.meetingfilm.testng.films;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mooc.meetingfilm.testng.common.RestUtils;
import com.mooc.meetingfilm.utils.common.vo.BaseResponseVO;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author by 完善者
 * @date 2021/4/13 14:10
 * @DESC
 */
@Slf4j
public class FilmsTest {

    @Test
    public void addFilm(){
        String url = "http://localhost:8401/films/film:add";
        FilmSavedReqVO filmSavedReqVO = new FilmSavedReqVO();
        filmSavedReqVO.setFilmStatus("1");
        filmSavedReqVO.setFilmName("SpringCloud Jiangzh讲的课程");
        filmSavedReqVO.setFilmEnName("SpringCloud");
        filmSavedReqVO.setMainImgAddress("/imgs/main.jpg");
        filmSavedReqVO.setFilmScore("10.0");
        filmSavedReqVO.setFilmScorers("123456");
        filmSavedReqVO.setPreSaleNum("50000");
        filmSavedReqVO.setBoxOffice("90000");
        filmSavedReqVO.setFilmTypeId("1");
        filmSavedReqVO.setFilmSourceId("1");
        filmSavedReqVO.setFilmCatIds("1");
        filmSavedReqVO.setAreaId("1");
        filmSavedReqVO.setDateId("1");
        filmSavedReqVO.setFilmTime("2025-12-11");
        filmSavedReqVO.setDirectorId("1");
        filmSavedReqVO.setActIds("1,2");
        filmSavedReqVO.setRoleNames("管理员,实习");
        filmSavedReqVO.setFilmLength("20");
        filmSavedReqVO.setBiography("SpringCloud Jiangzh讲的课程");
        filmSavedReqVO.setFilmImgs("/imgs/1.jpg,/imgs/2.jpg,/imgs/3.jpg,/imgs/4.jpg,/imgs/5.jpg");
        RestTemplate restTemplate = RestUtils.getRestTemplate();
        ResponseEntity<BaseResponseVO> baseResponse = restTemplate.postForEntity(url, filmSavedReqVO, BaseResponseVO.class);
        //验证返回值的code是不是200
        BaseResponseVO body = baseResponse.getBody();
        Integer code = new Integer(200);
        //第一道拦截
        Assert.assertEquals(code,body.getCode());

    }

    @Test
    public void films(String filmsName,int expectCount){
        String url = "http://localhost:8401/films";
        RestTemplate restTemplate = RestUtils.getRestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        JSONObject result = JSONObject.parseObject(response);
        //数量是否大于1

        //名字与插入的内容是否相同
        JSONObject data = result.getJSONObject("data");
        JSONArray films = data.getJSONArray("films");
        //成功计数器
        int count = 0;
        List<DescribeFilmsRespVO> describeFilmsRespVOS = films.toJavaList(DescribeFilmsRespVO.class);
        for (DescribeFilmsRespVO vo : describeFilmsRespVOS) {
            log.info("vo: {},count：{}" , vo,count);
            if (vo.getFilmEnName().equals(filmsName)){
                expectCount ++;
            }
        }
        Assert.assertEquals(count, 1);
        log.info("response：{}",response);
    }

    @DataProvider(name = "filmsDataProvider")
    public Object[][] filmsDateProvider(){
        Object[][] objects = new Object[][]{
                {"SpringCloud",1},
                {"SpringCloud2",0}
        };

        return objects;
    }

    @Data
    public static class DescribeFilmsRespVO{
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

    @Data
    public static class FilmSavedReqVO{
        private String filmStatus;
        private String filmName;
        private String filmEnName;
        private String mainImgAddress;
        private String filmScore;
        private String filmScorers;
        private String preSaleNum;
        private String boxOffice;
        private String filmTypeId;
        private String filmSourceId;
        private String filmCatIds;
        private String areaId;
        private String dateId;
        private String filmTime;
        private String directorId;
        private String actIds;      // actIds与RoleNames是不是能在数量上对应上
        private String roleNames;
        private String filmLength;
        private String biography;
        private String filmImgs;
    }
}
