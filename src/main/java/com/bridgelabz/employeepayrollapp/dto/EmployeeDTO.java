package com.bridgelabz.employeepayrollapp.dto;

<<<<<<< HEAD
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

@ToString
public class EmployeeDTO {

    @NotEmpty(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[A-Za-z]{2,}$", message = "Start Name With Capital Letter")
    public String name;

    @Min(value = 500, message = "Salray shoild be greater than 500")
=======
public class EmployeeDTO {
    public String name;
>>>>>>> remote-2/master
    public double salary;
}
