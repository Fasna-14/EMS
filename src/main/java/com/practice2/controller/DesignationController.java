package com.practice2.controller;

import com.practice2.dto.DesignationDto;
import com.practice2.entity.Designation;
import com.practice2.services.DesignationService;
import com.practice2.utils.EndPointURI;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DesignationController {
    @Autowired
    private DesignationService designationService;

    @PostMapping(EndPointURI.DESIGNATION)
    public ResponseEntity<Object> addDesignation(@RequestBody DesignationDto designationDto){
        Designation designation = new Designation();
        BeanUtils.copyProperties(designationDto,designation);
        designationService.saveDesignation(designation);
        return ResponseEntity.ok("Designation added successfully");
    }

    @PutMapping(EndPointURI.DESIGNATION)
    public ResponseEntity<Object> updateDesignation(@RequestBody DesignationDto designationDto){
        Designation designation = new Designation();
        BeanUtils.copyProperties(designationDto,designation);
        designationService.saveDesignation(designation);
        return ResponseEntity.ok("Designation Updated Successfully");
    }

    @GetMapping(EndPointURI.DESIGNATION)
    public ResponseEntity<Object> getDesignation() {
        Designation designation = new Designation();
        return ResponseEntity.ok(designationService.getAllDesignation());
    }

    @DeleteMapping(EndPointURI.DESIGNATION_ID)
    public ResponseEntity<Object> deleteDesignation(@PathVariable Long id){
        Designation designation = new Designation();
        designationService.deleteDesignation(id);
        return  ResponseEntity.ok("Designation successfully deleted");
    }


}


