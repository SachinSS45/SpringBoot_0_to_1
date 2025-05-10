package com.sachin.SpringWebMVC.controllers;

import com.sachin.SpringWebMVC.dto.EmployeeDTO;
import com.sachin.SpringWebMVC.entities.EmployeeEntity;
import com.sachin.SpringWebMVC.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//        @GetMapping(path = "/getSecretMessage") ///getSecretMessage called as resource locator
//        public String getMySuperSecretMessage(){
//            return "Secret message : asdfsdf@43e5";
//        }

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping(path = "/{employeeId}")
    public EmployeeEntity getEmployeeByID(@PathVariable(name = "employeeId") Long employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployees(@RequestParam(required = false) Integer age){
        return employeeRepository.findAll();
    }


    @PostMapping
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeRepository.save(employeeEntity);
    }

    @PutMapping
    public String updateEmployeeById(){
        return "Hello from put";
    }
}
