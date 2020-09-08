package com.msr.msrshop.coupon.dao;

import com.msr.msrshop.coupon.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author yang
 * @email yang@gmail.com
 * @date 2020-09-08 15:50:15
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}