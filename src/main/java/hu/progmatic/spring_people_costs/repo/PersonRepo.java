package hu.progmatic.spring_people_costs.repo;

import hu.progmatic.spring_people_costs.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
}
