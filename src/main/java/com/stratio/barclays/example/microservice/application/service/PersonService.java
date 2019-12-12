package com.stratio.barclays.example.microservice.application.service;

import com.stratio.barclays.example.microservice.application.mapper.PersonMapper;
import com.stratio.barclays.example.microservice.application.port.PersonProvider;
import com.stratio.barclays.example.microservice.application.port.PersonRepository;
import com.stratio.barclays.example.microservice.domain.Person;


public class PersonService implements PersonProvider {

  private PersonRepository personRepository;

  public PersonService(PersonRepository personRepository){
    this.personRepository = personRepository;
  }

  public String getFullNameByEmail(String email){
    Person person = PersonMapper.mapToPerson(personRepository.getPersonByEmail(email));

    return person.getName() + " " + person.getSurname();
  }

}
