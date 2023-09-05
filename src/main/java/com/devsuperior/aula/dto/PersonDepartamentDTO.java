package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;

public class PersonDepartamentDTO {

    private Long id;

    private String name;

    private Double salary;

    private DepartamentDTO departament;

    public PersonDepartamentDTO(Long id, String name, Double salary, DepartamentDTO departament) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departament = departament;
    }

    public PersonDepartamentDTO(Person person) {
        this(person.getId(), person.getName(), person.getSalary(), new DepartamentDTO(person.getDepartment()));
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

    public DepartamentDTO getDepartament() {
        return departament;
    }

    public void setDepartament(DepartamentDTO departament) {
        this.departament = departament;
    }
}
