package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeData;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements IEmployeeServices{

    @Autowired
    private EmployeeRepo empRepo;

    @Override
    public EmployeeData addEmployee(EmployeeDTO employeeDTO) {
        EmployeeData empData = new EmployeeData(employeeDTO);
        return empRepo.save(empData);
    }
}
