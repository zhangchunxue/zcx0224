package io.zcx.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zcx.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.zcx.jcartadministrationback.po.Return;

public interface ReturnService {
    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);
    Return getById(Integer returnId);
    void update(Return aReturn);
}
