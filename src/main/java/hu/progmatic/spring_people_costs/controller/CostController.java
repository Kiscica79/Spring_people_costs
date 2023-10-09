package hu.progmatic.spring_people_costs.controller;

import hu.progmatic.spring_people_costs.model.Cost;
import hu.progmatic.spring_people_costs.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/costs")
public class CostController {

    private final CostService costService;

    @Autowired
    public CostController(CostService costService) {
        this.costService = costService;
    }

    @GetMapping("")
    public List<Cost> getAllCosts() {
        return costService.getAllCosts();
    }

    @PostMapping("")
    public Cost createCost(@RequestBody Cost cost) {
        return costService.createCost(cost);
    }
}
