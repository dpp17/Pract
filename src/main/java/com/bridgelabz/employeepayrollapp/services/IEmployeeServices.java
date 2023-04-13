package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeData;

public interface IEmployeeServices {
    EmployeeData addEmployee(EmployeeDTO employeeDTO);
}
