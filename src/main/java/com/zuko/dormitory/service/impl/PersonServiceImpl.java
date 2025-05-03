package com.zuko.dormitory.service.impl;

import com.zuko.dormitory.model.request.PersonRequest;
import com.zuko.dormitory.model.response.PersonResponse;
import com.zuko.dormitory.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public PersonResponse createPerson(PersonRequest request) {
        return null;
    }

    @Override
    public PersonResponse getPersonById(Long id) {
        return null;
    }

    @Override
    public List<PersonResponse> getAllPersons() {
        return List.of();
    }

    @Override
    public PersonResponse updatePerson(Long id, PersonRequest request) {
        return null;
    }

    @Override
    public void deletePerson(Long id) {

    }
}
