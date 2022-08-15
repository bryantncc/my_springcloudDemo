package com.ncc.cloud.payment.service.impl;

import com.ncc.cloud.payment.dao.ProductMapper;
import com.ncc.cloud.payment.entity.Product;
import com.ncc.cloud.payment.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    public Product selectById(Long id) {
        return productMapper.selectById(id);
    }

    public int deleteById(Long id) {
        return productMapper.deleteById(id);
    }

    public int updateById(Long id, String name) {
        return productMapper.updateById(id, name);
    }

    public int insertOne(Product product) {
        return productMapper.insertOne(product);
    }
}