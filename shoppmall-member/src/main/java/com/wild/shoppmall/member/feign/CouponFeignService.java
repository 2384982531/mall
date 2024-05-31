package com.wild.shoppmall.member.feign;

import com.wild.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @Author: wild
 * @Date: 2024/5/31 15:28
 */
@FeignClient("shoppmall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
