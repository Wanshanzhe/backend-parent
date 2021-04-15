package com.mooc.meetingfilm.apis.film;

import com.mooc.meetingfilm.apis.film.vo.DescribeFilmRespVO;
import com.mooc.meetingfilm.utils.common.vo.BaseResponseVO;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author by 完善者
 * @date 2021/4/11 13:07
 * @DESC
 */
public interface FilmFeignApis {

    /**
     * 对外暴露的接口服务
     * @param filmId
     * @return
     * @throws CommonServiceException
     */
    @RequestMapping(value = "/films/{filmId}",method = RequestMethod.GET)
    BaseResponseVO<DescribeFilmRespVO> describeFilmById(@PathVariable("filmId") String filmId) throws CommonServiceException;
}
