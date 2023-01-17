package com.example.ejemplo2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Data
@RestResource(rel = "tickets", path = "ticket")
public class Ticket {
    @Id
    long id;
    @OneToOne
    CustomerEntity customer;
    @OneToOne
    Product product;
}
