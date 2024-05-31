package com.wild.shoppmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wild.common.utils.PageUtils;
import com.wild.shoppmall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author wild
 * @email 2384982531@qq.com
 * @date 2024-05-31 13:05:32
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

