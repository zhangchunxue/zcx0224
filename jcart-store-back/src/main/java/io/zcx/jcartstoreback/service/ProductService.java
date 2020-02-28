package io.zcx.jcartstoreback.service;


import io.zcx.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

}
