package com.zuko.dormitory.service;

import com.zuko.dormitory.model.request.PersonRequest;
import com.zuko.dormitory.model.response.PersonResponse;

import java.util.List;

public interface PersonService {

    PersonResponse createPerson(PersonRequest request);

    PersonResponse getPersonById(Long id);

    List<PersonResponse> getAllPersons();

    PersonResponse updatePerson(Long id, PersonRequest request);

    void deletePerson(Long id);
}