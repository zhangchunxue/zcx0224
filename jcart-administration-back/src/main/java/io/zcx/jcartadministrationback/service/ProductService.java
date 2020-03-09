package io.zcx.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zcx.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.zcx.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.zcx.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.zcx.jcartadministrationback.dto.out.ProductListOutDTO;
import io.zcx.jcartadministrationback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO, Integer pageNum);

    ProductShowOutDTO getById(Integer productId);
}
