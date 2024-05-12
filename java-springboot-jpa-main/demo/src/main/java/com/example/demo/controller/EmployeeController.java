package com.example.demo.controller;

import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.data.Employee;
import com.example.demo.data.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository){
        this.repository = repository;
    }

    @GetMapping("/health")
    ResponseEntity<String> health(){
        return ResponseEntity.ok("Service is up!!!");
    }

    @GetMapping("/employees")
    List<Employee> all() {
        return repository.findAll();
    }

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setId(id);
                    employee.setRole(newEmployee.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }

    @DeleteMapping("/employee/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
