package com.stratio.barclays.example.microservice.infrastructure.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stratio.barclays.example.microservice.application.port.PersonProvider;

@RestController
public class PersonController {

  private final PersonProvider personProvider;

  public PersonController(PersonProvider personProvider) {
    this.personProvider = personProvider;
  }

  @GetMapping("/fullNameFromEmail")
  public ResponseEntity<String> endpointGetNameAndSurnameFromEmail(@RequestParam String email){
    String fullName = personProvider.getFullNameByEmail(email);

    return ResponseEntity.ok(fullName);
  }

}
