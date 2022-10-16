package com.test.task.repository;

import com.test.task.TaskApplication;
import com.test.task.enums.CarBrand;
import com.test.task.model.Car;
import com.test.task.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
class PersonRepositoryTest {

    @Autowired
    private PersonRepository repository;

    @Test
    @DisplayName("Persons should be equals")
    void findById() {
        Person expectedPerson = Person.builder()
                .id(1)
                .lastName("Petrov")
                .cars(List.of(Car.builder().id(1).brand(CarBrand.CITROEN).build()))
                .build();

        Person actualPerson = repository.findById(1);

        assertEquals(expectedPerson, actualPerson);
    }

    @Test
    @DisplayName("Lists Persons should be equals")
    void findAll() {
        List<Person> expectedPerson = List.of(
                Person.builder()
                        .id(1)
                        .lastName("Petrov")
                        .cars(List.of(Car.builder().id(1).brand(CarBrand.CITROEN).build()))
                        .build(),
                Person.builder()
                        .id(2)
                        .lastName("Ivanov")
                        .cars(List.of(Car.builder().id(2).brand(CarBrand.HONDA).build(),
                                Car.builder().id(3).brand(CarBrand.LADA).build()))
                        .build(),
                Person.builder()
                        .id(3)
                        .lastName("Sidorov")
                        .cars(List.of(Car.builder().id(4).brand(CarBrand.VOLVO).build()))
                        .build());

        List<Person> actualPerson = repository.findAll();

        assertEquals(expectedPerson, actualPerson);
    }
}
