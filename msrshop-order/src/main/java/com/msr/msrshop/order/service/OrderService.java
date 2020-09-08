package com.msr.msrshop.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.common.utils.PageUtils;
import com.msr.msrshop.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author yang
 * @email yang@gmail.com
 * @date 2020-09-09 00:38:00
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

