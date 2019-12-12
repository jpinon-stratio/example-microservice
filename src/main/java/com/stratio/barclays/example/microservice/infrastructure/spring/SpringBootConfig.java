package com.stratio.barclays.example.microservice.infrastructure.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.stratio.barclays.example.microservice.application.port.PersonProvider;
import com.stratio.barclays.example.microservice.application.port.PersonRepository;
import com.stratio.barclays.example.microservice.application.service.PersonService;

@Configuration
@ComponentScan({"com.stratio.barclays.example.microservice"})
public class SpringBootConfig {

  @Bean
  public PersonProvider personProvider(PersonRepository personRepository){
    return new PersonService(personRepository);
  }

}
