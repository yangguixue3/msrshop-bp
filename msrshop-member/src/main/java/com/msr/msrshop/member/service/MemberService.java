package com.msr.msrshop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.common.utils.PageUtils;
import com.msr.msrshop.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author yang
 * @email yang@gmail.com
 * @date 2020-09-08 22:38:22
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

