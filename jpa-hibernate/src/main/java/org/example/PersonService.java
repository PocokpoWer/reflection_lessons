package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository repo;

    void addPerson(Person person) {
        repo.save(person);
    }

    void updatePerson(Person person) { repo.save(person); }

    void deletePerson(long id) {
        repo.deleteById(id);
    }

    List<Person> findAllPerson() {
        return repo.findAll();
    }

    void findPersonById(long id) {
        repo.findById(id);
    }
}
