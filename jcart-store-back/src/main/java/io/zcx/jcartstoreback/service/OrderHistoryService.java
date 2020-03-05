package io.zcx.jcartstoreback.service;

import io.zcx.jcartstoreback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {
    List<OrderHistory> getByOrderId(Long orderId);
}
