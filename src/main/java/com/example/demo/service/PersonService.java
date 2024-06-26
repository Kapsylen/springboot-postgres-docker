package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persons;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {

	

	private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public List<Persons> findAll(){
		return personRepository.findAll();
	}
	
	
}
