package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
<<<<<<< HEAD
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
=======

>>>>>>> remote-2/master
@Entity
public class EmployeeData {
    @Id
    @GeneratedValue
    private int emp_id;
    private String name;
    private double salary;

    public EmployeeData(EmployeeDTO employeeDTO) {
        this.name = employeeDTO.name;
        this.salary = employeeDTO.salary;
    }
<<<<<<< HEAD
=======
    public EmployeeData(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
>>>>>>> remote-2/master
}
