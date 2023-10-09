package hu.progmatic.spring_people_costs.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String birthplace;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Cost> costs;

    public Person() {}

    public Person(Integer id, String name, String birthplace) {
        this.id = id;
        this.name = name;
        this.birthplace = birthplace;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public List<Cost> getCosts() {
        return costs;
    }

    public void setCosts(List<Cost> costs) {
        this.costs = costs;
    }
}
