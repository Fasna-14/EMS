package com.practice2.services;

import com.practice2.dto.EmployeeDto;
import com.practice2.entity.Employee;
import com.practice2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Transactional
    public void deleteEmployee(String employeeId) {
        employeeRepository.deleteByEmployeeId(employeeId);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean existByEmployeeId(String id) {
        return employeeRepository.existsByEmployeeId(id);
    }
}
