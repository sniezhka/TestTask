package com.test.task.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Person {
    private Integer id;
    private String lastName;
    private List<Car> cars;
}
