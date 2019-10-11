package com.hp.product.client.service;

import com.hp.product.common.domain.ProductOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @title:
 * @author: xiaodong
 * @date: 2019/10/11 11:31
 * @desc:
 */
@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("/product/list")
    List<ProductOutput>  getProductList();
}
