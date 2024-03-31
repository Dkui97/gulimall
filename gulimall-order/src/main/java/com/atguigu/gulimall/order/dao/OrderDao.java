package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Dkui
 * @email msksnkx@163.com
 * @date 2024-03-31 17:40:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
