package com.msr.msrshop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.common.utils.PageUtils;
import com.msr.msrshop.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author tom
 * @email tom@gmail.com
 * @date 2020-09-01 15:48:29
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

