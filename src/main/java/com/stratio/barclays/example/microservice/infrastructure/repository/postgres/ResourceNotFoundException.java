package com.stratio.barclays.example.microservice.infrastructure.repository.postgres;


public class ResourceNotFoundException extends RuntimeException {

  public ResourceNotFoundException() {
    super("Resource was not found");
  }

  public ResourceNotFoundException(String message) {
    super(message);
  }
}
