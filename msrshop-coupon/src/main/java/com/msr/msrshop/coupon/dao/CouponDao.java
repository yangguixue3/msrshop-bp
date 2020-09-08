package com.msr.msrshop.coupon.dao;

import com.msr.msrshop.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yang
 * @email yang@gmail.com
 * @date 2020-09-08 15:50:15
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
