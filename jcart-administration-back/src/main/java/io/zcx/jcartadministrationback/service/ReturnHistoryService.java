package io.zcx.jcartadministrationback.service;

import io.zcx.jcartadministrationback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {
    List<ReturnHistory> getListByReturnId(Integer returnId);
    Long create(ReturnHistory returnHistory);
}
