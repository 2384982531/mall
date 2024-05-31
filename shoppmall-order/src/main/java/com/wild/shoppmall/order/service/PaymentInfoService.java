package com.wild.shoppmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wild.common.utils.PageUtils;
import com.wild.shoppmall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author wild
 * @email 2384982531@qq.com
 * @date 2024-05-31 13:05:32
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

