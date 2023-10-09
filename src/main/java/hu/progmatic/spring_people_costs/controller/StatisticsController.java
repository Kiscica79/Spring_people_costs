package hu.progmatic.spring_people_costs.controller;

import hu.progmatic.spring_people_costs.model.Person;
import hu.progmatic.spring_people_costs.service.StatisticsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stat")
public class StatisticsController {
    private final StatisticsService statisticsService;

    public StatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping("/stat/maxCost")
    public Person getPersonWithMaxCost() {
        return statisticsService.getPersonWithMaxCosts();
    }


}
