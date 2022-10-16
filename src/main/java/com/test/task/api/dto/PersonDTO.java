package com.test.task.api.dto;

import com.test.task.model.Car;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PersonDTO {
    private Integer id;
    private String lastName;
    private List<Car> cars;
}
