package com.example.repository;

import com.example.dao.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,String> {
}
