package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.DepartamentDTO;
import com.devsuperior.aula.dto.PersonDepartamentDTO;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public PersonDepartamentDTO insert(PersonDepartamentDTO dto) {

        var departament = departmentRepository.getReferenceById(dto.getDepartament().getId());
        dto.setDepartament(new DepartamentDTO(departament));

        Person person = new Person().fromEntity(dto);

        person = personRepository.save(person);

        return new PersonDepartamentDTO(person);
    }
}
