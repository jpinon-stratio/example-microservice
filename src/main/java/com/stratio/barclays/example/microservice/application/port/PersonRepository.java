package com.stratio.barclays.example.microservice.application.port;

public interface PersonRepository {
  IPerson getPersonByEmail(String email);
}
