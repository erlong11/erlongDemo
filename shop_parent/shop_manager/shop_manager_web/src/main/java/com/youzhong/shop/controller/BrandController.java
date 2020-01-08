package com.youzhong.shop.controller;

import com.youzhong.shop.entity.Brand;
import com.youzhong.shop.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private IBrandService brandService;

    @GetMapping("findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }



}
