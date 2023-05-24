package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeData;
import com.bridgelabz.employeepayrollapp.services.IEmployeeServices;
<<<<<<< HEAD
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> remote-2/master

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeServices iEmployeeServices;

<<<<<<< HEAD
    //////////////////// ::  Save Description  :: ////////////////////
    @PostMapping("/add")
    public ResponseDTO addEmployee(@Valid @RequestBody EmployeeDTO employeeDTO){
=======
    @PostMapping("/add")
    public ResponseDTO addEmployee(@RequestBody EmployeeDTO employeeDTO){
>>>>>>> remote-2/master
        EmployeeData empData = iEmployeeServices.addEmployee(employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Data added Successfully", empData);
        return responseDTO;
    }
<<<<<<< HEAD

    //////////////////// ::  Get Description By Id :: ////////////////////
    @GetMapping("/getEmp/{id}")
    public String getEmployeeDetailById(@PathVariable int id){
        return iEmployeeServices.getEmployeeDetailById(id);
    }

    //////////////////// ::  Get All Description  :: ////////////////////
    @GetMapping("/getAllEmp")
    public List<EmployeeData> getAllEmployees(){
        return iEmployeeServices.getAllEmployees();
    }

    //////////////////// ::  Edit Description :: ////////////////////
    @PutMapping("/editEmp/{id}")
    public String editEmployeeDetailsById(@Valid @RequestBody EmployeeDTO employeeDTO, @PathVariable int id){
        EmployeeData empList = new EmployeeData(employeeDTO);
        return iEmployeeServices.editEmployeeDetailsById(empList,id);
    }

    //////////////////// ::  Delete Description By Id :: ////////////////////
    @DeleteMapping("/deleteEmp/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return iEmployeeServices.deleteEmployeeById(id);
    }

    //////////////////// ::  Delete All Description :: ////////////////////
    @DeleteMapping("/deleteAllEmp/")
    public String deleteAllEmployees(){
        return iEmployeeServices.deleteAllEmployees();
    }


=======
>>>>>>> remote-2/master
}
