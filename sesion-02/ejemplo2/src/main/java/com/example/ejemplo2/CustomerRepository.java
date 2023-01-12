package com.example.ejemplo2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
    public List<CustomerEntity> findByNameIgnoreCaseContaining(@Param("name") String name);
}
