package com.example.demo.data;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Qqun,Long> {

    Collection<Qqun> getUserByLastName(String lastName);
    
}
