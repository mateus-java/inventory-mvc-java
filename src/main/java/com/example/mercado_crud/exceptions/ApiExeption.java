package com.example.mercado_crud.exceptions;

import org.springframework.http.HttpStatus;

public class ApiExeption extends  RuntimeException{
    private final HttpStatus status;

    public ApiExeption(String message, HttpStatus status){
        super(message);
        this.status = status;
    }
    public  HttpStatus getStatus(){
        return status;
    }
}
