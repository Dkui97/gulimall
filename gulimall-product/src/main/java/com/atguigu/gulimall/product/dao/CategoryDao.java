package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Dkui
 * @email msksnkx@163.com
 * @date 2024-03-31 16:50:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
