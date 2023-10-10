package com.practice2.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class EmployeeDto {
    private Long id;
    private String employeeId;
    @NotNull(message = "First name should not be null")
    @NotEmpty(message = "First name should not be empty")
    private String firstName;
    @NotNull(message = "Last name should not be null")
    @NotEmpty(message = "Last name should not be empty")
    private String lastName;
    @NotNull(message = "Email Id should not be null")
    @NotEmpty(message = "Email Id should not be empty")
    private String emailId;
}
