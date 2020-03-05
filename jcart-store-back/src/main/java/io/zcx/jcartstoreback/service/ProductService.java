package io.zcx.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.zcx.jcartstoreback.dto.out.ProductListOutDTO;
import io.zcx.jcartstoreback.dto.out.ProductShowOutDTO;
import io.zcx.jcartstoreback.po.Product;

public interface ProductService {

    Product getById(Integer productId);
    ProductShowOutDTO getShowById(Integer productId);
    Page<ProductListOutDTO> search(Integer pageNum);

}
