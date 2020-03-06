package io.zcx.jcartadministrationback.service;

import io.zcx.jcartadministrationback.po.Address;

import java.util.List;

public interface AddressService {
    Address getById(Integer addressId);
    List<Address> getByCustomerId(Integer customerId);
}
