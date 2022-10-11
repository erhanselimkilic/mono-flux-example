package com.monoflux.demo.service;

import com.monoflux.demo.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    void create(Employee e);

    Mono<Employee> findById(Long id);

    Flux<Employee> findByName(String name);

    Flux<Employee> findAll();

    Mono<Employee> update(Employee e);

    Mono<Void> delete(Long id);

}
