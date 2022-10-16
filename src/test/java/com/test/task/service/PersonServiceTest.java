package com.test.task.service;

import com.test.task.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
class PersonServiceTest {

    @Mock
    private PersonRepository repository;

    private PersonService service;

    @BeforeEach
    void setUp() {
        service = new PersonService(repository);
    }

    @Test
    void findAll() {
        service.findAll();
        verify(repository).findAll();
    }

    @Test
    void findById() {
        service.findById(1);
        verify(repository).findById(1);
    }
}