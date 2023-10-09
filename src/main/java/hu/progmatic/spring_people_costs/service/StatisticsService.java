package hu.progmatic.spring_people_costs.service;

import hu.progmatic.spring_people_costs.model.Cost;
import hu.progmatic.spring_people_costs.model.Person;
import hu.progmatic.spring_people_costs.repo.CostRepo;
import hu.progmatic.spring_people_costs.repo.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticsService {

    private final CostRepo costRepo;
    private final PersonRepo personRepo;

    public StatisticsService(CostRepo costRepo, PersonRepo personRepo) {
        this.costRepo = costRepo;
        this.personRepo = personRepo;
    }

    public Person getPersonWithMaxCosts() {
        Person personWithMaxCosts = null;
        double maxCost = Double.MIN_VALUE;

        List<Cost> allCosts = costRepo.findAll();
        for (Cost cost : allCosts) {
            if (cost.getAmount() > maxCost) {
                maxCost = cost.getAmount();
                personWithMaxCosts = cost.getPerson();
            }
        }
        return personWithMaxCosts;
    }


}
