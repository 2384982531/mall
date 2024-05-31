package com.wild.shoppmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wild.common.utils.PageUtils;
import com.wild.shoppmall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author wild
 * @email 2384982531@qq.com
 * @date 2024-05-31 13:05:33
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

