package com.sachin.SpringWebMVC.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class EmployeeDTO {


    private Long id;

    @NotBlank(message = "Name of the employee can't be blank")
    @Size(min=2,max = 10,message = "Number of characters in name should be in the range : [3,10]")
    private String name;

    @NotNull
    @Email(message = "Email should be valid ")
    private String email;

    @NotNull
    @Max(value = 80,message = "Age of employee can't be greater than 80")
    @Min(value = 18,message = "Age can't be less than 18")
    private Integer age;

    @NotBlank(message = "Role of employee can't be blank")
    @Pattern(regexp = "^(ADMIN|USER)$",message = "Role of Employee can be USER or ADMIN")
    private String role;//ADMIN,USER

//    @NotNull(message = "Salary of employee should not be null")
//    @Positive(message = "Salary of employee should be positive")
//    private Integer salary;

    @Digits(integer = 6,fraction = 2,message = "The salary can be in the form of XXXXX.YY")
    @DecimalMin(value = "100.10")
    @DecimalMax(value = "100000.20")
    private Double salary;
    @PastOrPresent(message = "date of joining employee can't be in the future")
    private LocalDate dateOfJoining;

    @JsonProperty("isActive")
    @AssertTrue(message = "Employee should be active")
    private Boolean isActive;

    public EmployeeDTO() {

    }

    public EmployeeDTO(Long id, String name, String email, Integer age,String role,Double salary, LocalDate dateOfJoining, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.role=role;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
