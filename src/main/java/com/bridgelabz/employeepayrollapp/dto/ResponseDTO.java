package com.bridgelabz.employeepayrollapp.dto;

<<<<<<< HEAD
import lombok.Data;

@Data
public class ResponseDTO {

    private String message;
    private Object data;
=======
public class ResponseDTO {

    public String message;
    public Object data;
>>>>>>> remote-2/master


    public ResponseDTO( String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
