package io.zcx.jcartstoreback.service;

import io.zcx.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.zcx.jcartstoreback.po.Customer;

public interface CustomerService {
    Integer register(CustomerRegisterInDTO customerRegisterInDTO);
    Customer getByUsername(String username);
    Customer getById(Integer customerId);
    void update(Customer customer);
}
