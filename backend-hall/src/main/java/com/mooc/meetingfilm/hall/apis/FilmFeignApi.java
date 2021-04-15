package com.mooc.meetingfilm.hall.apis;

import com.mooc.meetingfilm.apis.film.FilmFeignApis;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author by 完善者
 * @date 2021/4/11 14:05
 * @DESC film提供的服务
 */
@FeignClient(name = "film-service")
public interface FilmFeignApi extends FilmFeignApis {
}
