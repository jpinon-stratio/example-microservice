package com.stratio.barclays.example.microservice.infrastructure.repository.postgres;

import org.springframework.data.repository.CrudRepository;

public interface JpaPersonRepository extends CrudRepository<PersonEntity, String> {

}
