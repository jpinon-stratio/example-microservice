package com.stratio.barclays.example.microservice.infrastructure.repository.postgres;

import org.springframework.stereotype.Repository;

import com.stratio.barclays.example.microservice.application.port.IPerson;
import com.stratio.barclays.example.microservice.application.port.PersonRepository;

@Repository
public class PersonPostgresRepository implements PersonRepository {

  private final JpaPersonRepository jpaPersonRepository;

  public PersonPostgresRepository(JpaPersonRepository jpaPersonRepository){
    this.jpaPersonRepository = jpaPersonRepository;
  }

  public IPerson getPersonByEmail(String email){
    return jpaPersonRepository.findById(email).orElseThrow(ResourceNotFoundException::new);
  }
}
