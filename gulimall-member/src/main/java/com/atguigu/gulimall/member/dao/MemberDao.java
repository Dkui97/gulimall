package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Dkui
 * @email msksnkx@163.com
 * @date 2024-03-31 17:21:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
