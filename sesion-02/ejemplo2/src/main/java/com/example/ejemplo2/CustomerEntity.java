package com.example.ejemplo2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Data
@RestResource(rel = "customers", path = "customer")
public class CustomerEntity {
    @Id
    long id;
    @Column
    String name;
    @Column
    String adress;
    @Column
    String telephone;
    @Column @JsonIgnore
    String secret;
    @OneToOne
    CityEntity city;
}
