package com.wild.shoppmall.order.dao;

import com.wild.shoppmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wild
 * @email 2384982531@qq.com
 * @date 2024-05-31 13:05:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
