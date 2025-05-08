package com.sachin.SpringWebMVC.controllers;

import com.sachin.SpringWebMVC.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//        @GetMapping(path = "/getSecretMessage") ///getSecretMessage called as resource locator
//        public String getMySuperSecretMessage(){
//            return "Secret message : asdfsdf@43e5";
//        }

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeByID(@PathVariable(name = "employeeId") Long employeeId){
        return new EmployeeDTO(employeeId,"Sachin","sachin@gmail.com",24, LocalDate.of(2023,9,7),true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false) Integer age){
        return "Hi Age "+ age;
    }


    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        employeeDTO.setId(100L);//we are saying don't give id I will give
        return employeeDTO;
    }

    @PutMapping
    public String updateEmployeeById(){
        return "Hello from put";
    }
}
