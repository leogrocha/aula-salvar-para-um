package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.DepartamentDTO;
import com.devsuperior.aula.dto.PersonDTO;
import com.devsuperior.aula.dto.PersonDepartamentDTO;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonParaUmService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public PersonDTO insert(PersonDTO dto) {
        Person person = new Person().fromEntityParaUm(dto);
        var departament = departmentRepository.getReferenceById(dto.getDepartamentId());
        person.setDepartment(departament);

        person = personRepository.save(person);

        return new PersonDTO(person);
    }
}
