package hu.progmatic.spring_people_costs.controller;

import hu.progmatic.spring_people_costs.model.Person;
import hu.progmatic.spring_people_costs.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/people")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAllPeople() {
       return personService.getAllPeople();
    }

    @PostMapping("")
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Integer id, @ModelAttribute Person person) {
        return personService.updatePerson(id, person);
    }


}
