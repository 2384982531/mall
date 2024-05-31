package com.wild.shoppmall.product;

import com.wild.shoppmall.product.entity.BrandEntity;
import com.wild.shoppmall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @Author: wild
 * @Date: 2024/5/31 12:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTest {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLods(){
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("小米");
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("小米");
//        brandService.save(brandEntity);
        brandService.updateById(brandEntity);
        System.out.println("保存成功。。。。");
    }
}
