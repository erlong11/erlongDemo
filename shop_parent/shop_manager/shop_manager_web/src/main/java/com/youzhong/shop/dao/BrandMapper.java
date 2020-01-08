package com.youzhong.shop.dao;

import com.youzhong.shop.entity.Brand;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BrandMapper {
    List<Brand> findAll();

}
