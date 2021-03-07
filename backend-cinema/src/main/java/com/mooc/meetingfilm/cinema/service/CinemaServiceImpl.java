package com.mooc.meetingfilm.cinema.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.meetingfilm.cinema.controller.vo.CinemaSavedReqVO;
import com.mooc.meetingfilm.cinema.controller.vo.DescribeCinemasRespVO;
import com.mooc.meetingfilm.cinema.dao.entity.MoocCinemaT;
import com.mooc.meetingfilm.cinema.dao.mapper.MoocCinemaTMapper;
import com.mooc.meetingfilm.utils.exception.CommonServiceException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author by 完善者
 * @date 2021/3/7 22:25
 * @DESC
 */
@Service
public class CinemaServiceImpl implements CinemaServiceAPI {

    @Resource
    private MoocCinemaTMapper moocCinemaTMapper;

    @Override
    public void saveCinema(CinemaSavedReqVO reqVO) throws CommonServiceException {
        MoocCinemaT cinema = new MoocCinemaT();
        cinema.setCinemaName("");
        cinema.setCinemaPhone("");
        cinema.setBrandId(0);
        cinema.setAreaId(0);
        cinema.setHallIds("");
        cinema.setImgAddress("");
        cinema.setCinemaAddress("");
        cinema.setMinimumPrice(0);
        moocCinemaTMapper.insert(cinema);
    }

    @Override
    public IPage<DescribeCinemasRespVO> describeCinemas(int nowPage, int pageSize) throws CommonServiceException {
        // 查询实体对象，然后与表现层对象进行交互
        // TODO 提示
        Page<MoocCinemaT> page = new Page<>(nowPage,pageSize);
        IPage<MoocCinemaT> moocCinemaTIPage = moocCinemaTMapper.selectPage(page, null);

        // moocCinemaTIPage对象内的分页参数与IPage<DescribeCinemasRespVO>一模一样

        moocCinemaTIPage.getRecords(); // set到IPage<DescribeCinemasRespVO> records方法中
        return null;
    }
}
