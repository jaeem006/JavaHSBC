package com.example.ejemplo1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface UserRepository extends CrudRepository<WebsiteUser, Long> {
}
