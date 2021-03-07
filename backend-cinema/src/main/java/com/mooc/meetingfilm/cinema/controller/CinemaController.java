package com.mooc.meetingfilm.cinema.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.google.common.collect.Maps;
import com.mooc.meetingfilm.cinema.controller.vo.CinemaSavedReqVO;
import com.mooc.meetingfilm.cinema.controller.vo.DescribeCinemasRespVO;
import com.mooc.meetingfilm.cinema.service.CinemaServiceAPI;
import com.mooc.meetingfilm.utils.common.vo.BasePageVO;
import com.mooc.meetingfilm.utils.common.vo.BaseResponseVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author by 完善者
 * @date 2021/3/7 22:17
 * @DESC 影院模块表现层
 */

@RestController
@RequestMapping("/cinemas")
public class CinemaController {

    @Autowired
    private CinemaServiceAPI cinemaServiceAPI;

    @RequestMapping(value = "/cinema:add",method = RequestMethod.POST)
    public BaseResponseVO saveCinema(@RequestBody CinemaSavedReqVO cinemaSavedReqVO) throws CommonServiceException {

        //数据验证
        cinemaSavedReqVO.checkParam();

        cinemaServiceAPI.saveCinema(cinemaSavedReqVO);

        return BaseResponseVO.success();
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public BaseResponseVO describeCinemas(BasePageVO basePageVO) throws CommonServiceException {

        IPage<DescribeCinemasRespVO> result = cinemaServiceAPI.describeCinemas(basePageVO.getNowPage(), basePageVO.getPageSize());

        Map<String, Object> cinemas = describePageResult(result, "cinemas");
        //调用封装的分页返回方法
        return BaseResponseVO.success(cinemas);
    }


    /**
     * 获取分页对象的公共接口
     * @param page
     * @param title
     * @return
     */
    private Map<String,Object> describePageResult(IPage page, String title){
        Map<String,Object> result = Maps.newHashMap();
        result.put("totalSize",page.getTotal());
        result.put("totalPages",page.getPages());
        result.put("pageSize",page.getSize());
        result.put("nowPage",page.getCurrent());
        result.put(title, page.getRecords());
        return result;
    }
}
