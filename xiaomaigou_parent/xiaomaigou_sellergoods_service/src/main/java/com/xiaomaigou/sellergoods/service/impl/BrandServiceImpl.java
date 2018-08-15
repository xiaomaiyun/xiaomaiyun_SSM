package com.xiaomaigou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaomaigou.mapper.TbBrandMapper;
import com.xiaomaigou.pojo.TbBrand;
import com.xiaomaigou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//必须使用com.alibaba.dubbo.config.annotation.Servicez
@Service
public class BrandServiceImpl implements BrandService{

    //注意：此处为本地调用
    @Autowired
    private TbBrandMapper brandMapper;

    @Override
    public List<TbBrand> findAll() {
        return brandMapper.selectByExample(null);
    }
}
