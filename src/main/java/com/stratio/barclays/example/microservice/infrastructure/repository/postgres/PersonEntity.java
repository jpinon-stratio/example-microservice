package com.stratio.barclays.example.microservice.infrastructure.repository.postgres;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.stratio.barclays.example.microservice.application.port.IPerson;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "person")
public class PersonEntity implements IPerson {

  @Id
  private String email;

  private String name;

  private String surname;

}
