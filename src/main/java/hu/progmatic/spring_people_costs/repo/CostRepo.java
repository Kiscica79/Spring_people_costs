package hu.progmatic.spring_people_costs.repo;

import hu.progmatic.spring_people_costs.model.Cost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostRepo extends JpaRepository<Cost, Integer> {
}
