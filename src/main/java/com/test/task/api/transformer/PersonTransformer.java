package com.test.task.api.transformer;

import com.test.task.api.dto.PersonDTO;
import com.test.task.model.Person;

public class PersonTransformer {
    public static PersonDTO transform (Person person) {
        if (person == null)
            return null;

        return PersonDTO.builder()
                .id(person.getId())
                .lastName(person.getLastName())
                .cars(person.getCars())
                .build();
    }
}
