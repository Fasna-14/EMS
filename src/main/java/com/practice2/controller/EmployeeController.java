package com.practice2.controller;

import com.practice2.dto.EmployeeDto;
import com.practice2.entity.Employee;
import com.practice2.response.ValidationFailureResponse;
import com.practice2.services.EmployeeService;
import com.practice2.utils.Constants;
import com.practice2.utils.EndPointURI;
import com.practice2.utils.ValidationFailureResponseCode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class  EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ValidationFailureResponseCode validationFailureResponseCode;


    @PostMapping(EndPointURI.ADD_EMPLOYEE)
    public ResponseEntity<Object> addEmployee(@RequestBody EmployeeDto employeeDto){
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        employeeService.saveEmployee(employee);
        return ResponseEntity.ok("Employee added successfully!");
    }

    @PutMapping(EndPointURI.EMPLOYEES)
    public ResponseEntity<Object> updateEmployee(@RequestBody EmployeeDto employeeDto){
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        employeeService.saveEmployee(employee);
        return ResponseEntity.ok("Employee Updated Successfully");
    }

    @DeleteMapping(EndPointURI.EMPLOYEE)
    public ResponseEntity<Object> deleteEmployee(@PathVariable String id ){
        if(!employeeService.existByEmployeeId(id)){
          // return ResponseEntity.ok("Employee not found");
            return new ResponseEntity<>(new ValidationFailureResponse(Constants.EMPLOYEE_NOT_FOUND,
                    validationFailureResponseCode.getEmployeeNotExists()), HttpStatus.BAD_REQUEST);
        }
        employeeService.deleteEmployee(id);
       return ResponseEntity.ok("Employee deleted successfully");
    }

    @GetMapping(EndPointURI.EMPLOYEES)
    public ResponseEntity<Object> findAllEmployees() {
        return ResponseEntity.ok(employeeService.findAllEmployee());
    }

}
