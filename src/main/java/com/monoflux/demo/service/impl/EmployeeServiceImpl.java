package com.monoflux.demo.service.impl;

import com.monoflux.demo.model.Employee;
import com.monoflux.demo.repository.EmployeeRepository;
import com.monoflux.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void create(Employee e) {
        employeeRepository.save(e).subscribe();
    }

    public Mono<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public Flux<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    public Flux<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Mono<Employee> update(Employee e) {
        return employeeRepository.save(e);
    }

    public Mono<Void> delete(Long id) {
        return employeeRepository.deleteById(id);
    }

}