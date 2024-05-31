package com.wild.shoppmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wild.common.utils.PageUtils;
import com.wild.shoppmall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author wild
 * @email 2384982531@qq.com
 * @date 2024-05-31 13:05:33
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

