package io.zcx.jcartadministrationback.service;

import io.zcx.jcartadministrationback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {
    List<OrderHistory> getByOrderId(Long orderId);
    Long create(OrderHistory orderHistory);
}
