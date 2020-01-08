package com.youzhong.shop.service.impl;

import com.youzhong.shop.dao.BrandMapper;
import com.youzhong.shop.entity.Brand;
import com.youzhong.shop.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;
    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }
}
