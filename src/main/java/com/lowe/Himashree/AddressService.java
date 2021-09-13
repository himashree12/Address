package com.lowe.Himashree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public Contact addAddress(Contact address) {
        repository.save(address);
        return address;

    }

    public Contact getAddress(int id) {
        Optional<Contact> contact = repository.findById(id);
        if(contact.isPresent())
            return contact.get();
        else
            return null;
    }

    public void deleteAddress(int id) {
        repository.deleteById(id);
    }

    public Contact updateAddress(Contact address) {
        repository.save(address);
        return address;
    }
}
