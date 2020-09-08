package com.msr.msrshop.order.dao;

import com.msr.msrshop.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yang
 * @email yang@gmail.com
 * @date 2020-09-09 00:38:00
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
