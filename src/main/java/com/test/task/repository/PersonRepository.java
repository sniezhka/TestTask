package com.test.task.repository;

import com.test.task.config.Storage;
import com.test.task.model.Person;
import lombok.RequiredArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Repository
@RequiredArgsConstructor
public class PersonRepository implements Repository {
    private final Storage storage;

    @Override
    public List<Person> findAll() {
        return storage.getPersons().values()
                .stream()
                .toList();
    }

    @Override
    public Person findById(Integer id) {
        return storage.getPersons().get(id);
    }
}
