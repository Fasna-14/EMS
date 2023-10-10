package com.practice2.services;

import com.practice2.entity.Designation;

import java.util.List;

public interface DesignationService {
    void saveDesignation(Designation designation);
    List<Designation> getAllDesignation();

    void deleteDesignation(Long id);
}
