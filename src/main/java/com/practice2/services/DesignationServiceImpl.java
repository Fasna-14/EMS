package com.practice2.services;

import com.practice2.entity.Designation;
import com.practice2.repository.DesignationRepository;
import com.practice2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DesignationServiceImpl implements DesignationService{
    @Autowired
    private DesignationRepository designationRepository;

    @Override
    public void saveDesignation(Designation designation){
        designationRepository.save(designation);
    }

    @Override
    public List<Designation> getAllDesignation() {
        return designationRepository.findAll();
    }

    @Transactional
    public void deleteDesignation(Long id) {
        designationRepository.deleteById(id);
    }


}


