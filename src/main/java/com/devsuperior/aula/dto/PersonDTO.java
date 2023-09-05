package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDTO {

    private Long id;
    private String name;
    private Double salary;
    private Long departamentId;

    public PersonDTO(Long id, String name, Double salary, Long departamentId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departamentId = departamentId;
    }

    public PersonDTO(Person person) {
        id = person.getId();
        name = person.getName();
        salary = person.getSalary();
        departamentId = person.getDepartment().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Long getDepartamentId() {
        return departamentId;
    }

    public void setDepartamentId(Long departamentId) {
        this.departamentId = departamentId;
    }
}
