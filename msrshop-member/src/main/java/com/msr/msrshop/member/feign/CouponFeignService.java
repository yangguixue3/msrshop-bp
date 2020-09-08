package com.msr.msrshop.member.feign;

/**
 * @author tom
 * @version V1.0
 * @Package com.msr.msrshop.member.feign
 * @date 2020/9/2 16:33
 * @Copyright © 株式会社多言语系统研究所
 */

import com.msr.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是一个声明式的远程调用
 */
@Service
@FeignClient("msrshop-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}