package com.practice2.repository;

import com.practice2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    void deleteByEmployeeId(String employeeId);

    boolean existsByEmployeeId(String id);
}
