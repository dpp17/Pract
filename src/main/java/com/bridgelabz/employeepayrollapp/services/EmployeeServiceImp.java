package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
<<<<<<< HEAD
import com.bridgelabz.employeepayrollapp.exception.EmployeePayrollCustomException;
=======
>>>>>>> remote-2/master
import com.bridgelabz.employeepayrollapp.model.EmployeeData;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
=======
>>>>>>> remote-2/master

@Service
public class EmployeeServiceImp implements IEmployeeServices{

    @Autowired
    private EmployeeRepo empRepo;

    List<EmployeeData> list = new ArrayList<>();

    @Override
    public EmployeeData addEmployee(EmployeeDTO employeeDTO) {
        EmployeeData empData = new EmployeeData(employeeDTO);
          list.add(empData);
<<<<<<< HEAD
        return empRepo.save(empData);
    }

    @Override
    public String getEmployeeDetailById(int id) {
        EmployeeData empListId = empRepo.findById(id).orElseThrow(()->new EmployeePayrollCustomException("Employee not Found with ID:: " + id));
//        if(empListId){
            return "==>> " + empListId;
//        }
//        return "Employee with ID:: " + id + "  doesn't found !!";
    }

    @Override
    public List<EmployeeData> getAllEmployees() {
        return empRepo.findAll();
    }

    @Override
    public String editEmployeeDetailsById(EmployeeData empList, int id) {
        EmployeeData editEmployeeDetail = empRepo.findById(id).orElseThrow(()->new EmployeePayrollCustomException("Employee not Found with ID:: " + id));
//        if (editEmployeeDetail.isPresent()) {
            editEmployeeDetail.setName(empList.getName());
            editEmployeeDetail.setSalary(empList.getSalary());
            empRepo.save(editEmployeeDetail);
            return "Employee Details Edited Successfully.... Name:: " + empList.getName() +" || Salary :: " + empList.getSalary();
//        }
//        else
//            return " :: Employee ID:: "+ id +"  doesn't Exist ::";
    }

    @Override
    public String deleteEmployeeById(int id) {
        EmployeeData empList = empRepo.findById(id).orElseThrow(()->new EmployeePayrollCustomException("Employee not Found with ID:: " + id));
//        if(empList.isPresent()){
            empRepo.deleteById(id);
            return "Employee Details Deleted Successfully !!!";
//        }
//        return " :: Employee ID:: "+ id + "  doesn't Exist ::";
    }

    @Override
    public String deleteAllEmployees() {
        empRepo.deleteAll();
        return "All Employee's Detail-Recordsa are deleted";
    }


=======
//         empRepo.save(empData);
        return empData;
    }
>>>>>>> remote-2/master
}
