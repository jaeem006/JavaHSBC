package com.example.ejemplo2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Data
@RestResource(exported = false)
public class CityEntity {
    @Id
    long id;
    @Column
    String name;
    @Column
    String province;
}
