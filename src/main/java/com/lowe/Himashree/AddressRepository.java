package com.lowe.Himashree;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface AddressRepository extends CrudRepository {
    void findAllById(int id);
}
