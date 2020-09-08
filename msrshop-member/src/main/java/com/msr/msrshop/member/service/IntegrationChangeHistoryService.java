package com.msr.msrshop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.common.utils.PageUtils;
import com.msr.msrshop.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author tom
 * @email tom@gmail.com
 * @date 2020-09-01 15:48:29
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

