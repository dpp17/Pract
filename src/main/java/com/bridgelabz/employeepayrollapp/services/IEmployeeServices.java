package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeData;

<<<<<<< HEAD
import java.util.List;

public interface IEmployeeServices {
    EmployeeData addEmployee(EmployeeDTO employeeDTO);
    String getEmployeeDetailById(int id);
    List<EmployeeData> getAllEmployees();
    String editEmployeeDetailsById(EmployeeData empList, int id);
    String deleteEmployeeById(int id);
    String deleteAllEmployees();
=======
public interface IEmployeeServices {
    EmployeeData addEmployee(EmployeeDTO employeeDTO);
>>>>>>> remote-2/master
}
