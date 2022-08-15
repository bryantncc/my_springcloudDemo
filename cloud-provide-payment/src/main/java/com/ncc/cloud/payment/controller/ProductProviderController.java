package com.ncc.cloud.payment.controller;

import com.ncc.cloud.payment.dto.Result;
import com.ncc.cloud.payment.entity.Product;
import com.ncc.cloud.payment.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class ProductProviderController {

    @Resource
    private ProductService productService;

    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping("product/provider/get/{id}")
    public Result selectById(@PathVariable("id") Long id){
        return new Result(200, "查询成功", productService.selectById(id));
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("product/provider/delete/{id}")
    public Result deleteById(@PathVariable("id") Long id){
        return new Result(200, "删除成功", productService.deleteById(id));
    }

    /**
     * 修改
     * @param product
     * @return
     */
    @PostMapping("product/provider/update")
    public Result updateById(@RequestBody Product product){
        return new Result(200, "修改成功", productService.updateById(product.getId(), product.getName()));

    }

    /**
     * 新增
     * @return
     */
    @PutMapping( "product/provider/add")
    public Result insertById(@RequestBody Product product){
        return new Result(200, "修改成功", productService.insertOne(product));
    }
}