package com.msr.msrshop.order.dao;

import com.msr.msrshop.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author yang
 * @email yang@gmail.com
 * @date 2020-09-09 00:38:00
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
