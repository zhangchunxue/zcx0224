package io.zcx.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zcx.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.zcx.jcartadministrationback.dto.out.OrderListOutDTO;
import io.zcx.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.zcx.jcartadministrationback.po.Order;

public interface OrderService {
    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);
    OrderShowOutDTO getById(Long orderId);
    void update(Order order);
}
