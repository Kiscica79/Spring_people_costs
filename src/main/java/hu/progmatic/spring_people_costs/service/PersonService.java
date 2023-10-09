package hu.progmatic.spring_people_costs.service;

import hu.progmatic.spring_people_costs.model.Person;
import hu.progmatic.spring_people_costs.repo.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public List<Person> getAllPeople() {
        return personRepo.findAll();
    }

    public Person createPerson(Person person) {
        return personRepo.save(person);
    }

    public Person updatePerson(Integer id, Person person) {
        if (personRepo.existsById(id)) {
            person.setId(id);
            return personRepo.save(person);
        } else {
            return null;
        }
    }



}
