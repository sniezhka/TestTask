package com.test.task.api.controller;

import com.test.task.api.dto.PersonDTO;
import com.test.task.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {
    private final PersonService service;

    @GetMapping("/{id}")
    public PersonDTO get(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<PersonDTO> getAll() {
        return service.findAll();
    }
}
