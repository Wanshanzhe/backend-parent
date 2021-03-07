package com.mooc.meetingfilm.film.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.meetingfilm.film.controller.vo.DescribeActorsRespVO;
import com.mooc.meetingfilm.film.dao.entity.MoocActorT;

/**
 * <p>
 * 演员表 Mapper 接口
 * </p>
 *
 * @author wanshanzhe
 * @since 2021-03-07
 */
public interface MoocActorTMapper extends BaseMapper<MoocActorT> {

    IPage<DescribeActorsRespVO> describleActors(Page<DescribeActorsRespVO> page);
}
