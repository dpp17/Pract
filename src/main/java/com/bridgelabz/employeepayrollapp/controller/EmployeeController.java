package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeData;
import com.bridgelabz.employeepayrollapp.services.IEmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeServices iEmployeeServices;

    @PostMapping("/add")
    public EmployeeData addEmployee(@RequestBody EmployeeDTO employeeDTO){
        EmployeeData empData = iEmployeeServices.addEmployee(employeeDTO);
        return empData;
    }
}
