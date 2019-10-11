package com.hp.product.server.controller;

import com.hp.product.common.domain.ProductOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaodong
 * @title
 * @date 2019/10/11 12:52
 * @desc
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/list")
    public List<ProductOutput> getProductList(){
        List<ProductOutput> list = new ArrayList<>();
        ProductOutput product = new ProductOutput();
        product.setId(1);
        product.setName("tt");
        product.setPrice(12f);
        list.add(product);
        return list;
    }
}
