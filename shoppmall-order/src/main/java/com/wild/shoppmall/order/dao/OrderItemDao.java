package com.wild.shoppmall.order.dao;

import com.wild.shoppmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wild
 * @email 2384982531@qq.com
 * @date 2024-05-31 13:05:33
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
