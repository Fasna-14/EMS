package com.practice2.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Getter
@Setter
@Component
@PropertySource("classpath:validationmessage.properties")
public class ValidationFailureResponseCode {
    //public static String getEmployeeNotExist;
    @Value("${validation.employee.doesnotexist}")
    private String employeeNotExists;
}
