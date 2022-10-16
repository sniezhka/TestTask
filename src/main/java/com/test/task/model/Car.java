package com.test.task.model;

import com.test.task.enums.CarBrand;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private Integer id;
    private CarBrand brand;
}
