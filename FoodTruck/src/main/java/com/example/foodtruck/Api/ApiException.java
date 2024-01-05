package com.example.foodtruck.Api;

public class ApiException extends RuntimeException{
    public ApiException(String message){
        super(message);
    }
}