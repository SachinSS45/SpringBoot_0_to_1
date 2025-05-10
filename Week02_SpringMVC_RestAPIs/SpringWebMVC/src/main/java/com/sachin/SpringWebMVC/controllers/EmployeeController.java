package com.sachin.SpringWebMVC.controllers;

import com.sachin.SpringWebMVC.dto.EmployeeDTO;
import com.sachin.SpringWebMVC.entities.EmployeeEntity;
import com.sachin.SpringWebMVC.repositories.EmployeeRepository;
import com.sachin.SpringWebMVC.services.EmployeeService;
import org.modelmapper.ModelMapper;
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

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false) Integer age){
        return employeeService.getAllEmployees();
    }


    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(employeeDTO);
    }

    @PutMapping
    public String updateEmployeeById(){
        return "Hello from put";
    }
}
