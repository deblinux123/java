package com.example.storeDemo.repository;

import com.example.storeDemo.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
