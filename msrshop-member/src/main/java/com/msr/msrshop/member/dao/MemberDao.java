package com.msr.msrshop.member.dao;

import com.msr.msrshop.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tom
 * @email tom@gmail.com
 * @date 2020-09-01 15:48:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
