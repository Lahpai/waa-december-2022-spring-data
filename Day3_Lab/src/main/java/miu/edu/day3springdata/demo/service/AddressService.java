package miu.edu.day3springdata.demo.service;

import miu.edu.day3springdata.demo.entity.Address;

import java.util.List;

public interface AddressService {
    void save (Address address);
    List<Address> getAllAddress();

    Address findById(int id);

    void deleteById(int id);
}
