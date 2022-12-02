package miu.edu.day3springdata.demo.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.day3springdata.demo.entity.Address;
import miu.edu.day3springdata.demo.repository.AddressRepo;
import miu.edu.day3springdata.demo.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;

    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public List<Address> getAllAddress() {
        return (List<Address>) addressRepo.findAll();
    }

    @Override
    public Address findById(int id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
         addressRepo.deleteById(id);
    }
}
