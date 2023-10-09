package hu.progmatic.spring_people_costs.service;

import hu.progmatic.spring_people_costs.model.Cost;
import hu.progmatic.spring_people_costs.repo.CostRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostService {

    private final CostRepo costRepo;

    public CostService(CostRepo costRepo) {
        this.costRepo = costRepo;
    }

    public List<Cost> getAllCosts() {
       return costRepo.findAll();
    }

    public Cost createCost(Cost cost) {
        return costRepo.save(cost);
    }

}
