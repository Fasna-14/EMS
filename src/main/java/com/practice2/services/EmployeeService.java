package com.practice2.services;

import com.practice2.dto.EmployeeDto;
import com.practice2.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void saveEmployee(Employee employee);
    void deleteEmployee(String id);

    List<Employee> findAllEmployee();

    boolean existByEmployeeId(String id);
}
