package com.monoflux.demo.repository;

import com.monoflux.demo.model.Employee;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Long> {

    @Query("{ 'name': ?0 }")
    Flux<Employee> findByName(final String name);
}
