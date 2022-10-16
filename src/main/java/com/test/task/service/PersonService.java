package com.test.task.service;

import com.test.task.api.dto.PersonDTO;
import com.test.task.api.transformer.PersonTransformer;
import com.test.task.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.test.task.api.transformer.PersonTransformer.transform;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository repository;

    public List<PersonDTO> findAll() {
        return Optional.ofNullable(repository.findAll()).orElse(null)
                .stream()
                .map(PersonTransformer::transform)
                .collect(Collectors.toList());
    }

    public PersonDTO findById(Integer id) {
        return transform(repository.findById(id));
    }
}
