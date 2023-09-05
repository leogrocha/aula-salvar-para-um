package com.devsuperior.aula.entities;

import com.devsuperior.aula.dto.PersonDepartamentDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Person() {
    }

    public Person(Long id, String name, Double salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }


    public Person fromEntity(PersonDepartamentDTO personDepartamentDTO) {
        Person person = new Person();
        person.setId(personDepartamentDTO.getId());
        person.setName(personDepartamentDTO.getName());
        person.setSalary(personDepartamentDTO.getSalary());
        person.setDepartment(new Department(personDepartamentDTO.getDepartament()));
        return person;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
