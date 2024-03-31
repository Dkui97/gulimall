package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Dkui
 * @email msksnkx@163.com
 * @date 2024-03-31 17:05:11
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
