package com.test.task.repository;

import com.test.task.model.Person;

import java.util.List;

public interface Repository {
    List<Person> findAll();

    Person findById(Integer id);
}
