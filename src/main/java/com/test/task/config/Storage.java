package com.test.task.config;

import com.test.task.enums.CarBrand;
import com.test.task.model.Car;
import com.test.task.model.Person;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Data
public class Storage {
    Map<Integer, Person> persons = new HashMap<>();

    @Bean
    public Map<Integer, Person> createData() {
        persons.put(1, Person.builder()
                .id(1)
                .lastName("Petrov")
                .cars(List.of(Car.builder().id(1).brand(CarBrand.CITROEN).build()))
                .build());
        persons.put(2, Person.builder()
                .id(2)
                .lastName("Ivanov")
                .cars(List.of(Car.builder().id(2).brand(CarBrand.HONDA).build(),
                        Car.builder().id(3).brand(CarBrand.LADA).build()))
                .build());
        persons.put(3, Person.builder()
                .id(3)
                .lastName("Sidorov")
                .cars(List.of(Car.builder().id(4).brand(CarBrand.VOLVO).build()))
                .build());
        return persons;
    }
}
