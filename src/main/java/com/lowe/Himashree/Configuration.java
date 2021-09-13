package com.lowe.Himashree;

import org.springframework.context.annotation.Bean;

import java.util.Optional;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public AddressRepository get(){
        return new AddressRepository() {
            @Override
            public void findAllById(int id) {

            }

            @Override
            public Object save(Object o) {
                return null;
            }

            @Override
            public Iterable saveAll(Iterable iterable) {
                return null;
            }

            @Override
            public Optional findById(Object o) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Object o) {
                return false;
            }

            @Override
            public Iterable findAll() {
                return null;
            }

            @Override
            public Iterable findAllById(Iterable iterable) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Object o) {

            }

            @Override
            public void delete(Object o) {

            }

            @Override
            public void deleteAll(Iterable iterable) {

            }

            @Override
            public void deleteAll() {

            }
        };
    }
}
