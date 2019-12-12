package com.stratio.barclays.example.microservice.application.mapper;

import com.stratio.barclays.example.microservice.application.port.IPerson;
import com.stratio.barclays.example.microservice.domain.Person;

public class PersonMapper {

  public static Person mapToPerson(IPerson iPerson){
    return new Person(iPerson.getName(), iPerson.getSurname(), iPerson.getEmail());
  }
}
