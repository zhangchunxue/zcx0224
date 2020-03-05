package io.zcx.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.zcx.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.zcx.jcartstoreback.dto.out.OrderShowOutDTO;
import io.zcx.jcartstoreback.po.Order;

public interface OrderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO, Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}
