package com.zuko.dormitory.controller;

import com.zuko.dormitory.model.request.PersonRequest;
import com.zuko.dormitory.model.response.PersonResponse;
import com.zuko.dormitory.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public ResponseEntity<PersonResponse> createPerson(@RequestBody PersonRequest request) {
        return ResponseEntity.ok(personService.createPerson(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonResponse> getPerson(@PathVariable Long id) {
        return ResponseEntity.ok(personService.getPersonById(id));
    }

    @GetMapping
    public ResponseEntity<List<PersonResponse>> getAllPersons() {
        return ResponseEntity.ok(personService.getAllPersons());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonResponse> updatePerson(@PathVariable Long id, @RequestBody PersonRequest request) {
        return ResponseEntity.ok(personService.updatePerson(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return ResponseEntity.noContent().build();
    }
}