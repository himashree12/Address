package com.lowe.Himashree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    private AddressService service;

    @RequestMapping(value = "/create",produces = "application/json", consumes = "application/json")
    public ResponseEntity<Contact> add(@RequestBody Contact address){
        Contact add = service.addAddress(address);
        return new ResponseEntity<>(add, HttpStatus.OK);
    }

    @RequestMapping(value = "/put",produces = "application/json", consumes = "application/json")
    public ResponseEntity<Contact> put(@RequestBody Contact address){
        Contact add = service.updateAddress(address);
        return new ResponseEntity<>(add, HttpStatus.OK);
    }

    @RequestMapping(value = "/get",produces = "application/json")
    public ResponseEntity<Contact> get(@RequestParam int id){
        Contact add = service.getAddress(id);
        return new ResponseEntity<>(add, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete",produces = "application/json")
    public ResponseEntity<Contact> delete(@RequestParam int id){
        service.deleteAddress(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
