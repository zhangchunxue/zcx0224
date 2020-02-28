package io.zcx.jcartstoreback.controller;

import io.zcx.jcartstoreback.dto.in.ProductSearchInDTO;
import io.zcx.jcartstoreback.dto.out.PageOutDTO;
import io.zcx.jcartstoreback.dto.out.ProductListOutDTO;
import io.zcx.jcartstoreback.dto.out.ProductShowOutDTO;
import io.zcx.jcartstoreback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO = productService.getById(productId);
        return productShowOutDTO;
    }

}
