package hu.progmatic.spring_people_costs.model;

import jakarta.persistence.*;

@Entity
public class Cost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String location;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Cost() {}

    public Cost(Integer id, String location, double amount) {
        this.id = id;
        this.location = location;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
