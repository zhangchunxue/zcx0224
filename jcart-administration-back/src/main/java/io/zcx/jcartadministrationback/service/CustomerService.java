package io.zcx.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zcx.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.zcx.jcartadministrationback.po.Customer;

public interface CustomerService {
    Page<Customer> search(Integer pageNum);
    Customer getById(Integer customerId);
    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);
}
