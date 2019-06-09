package com.daria.Exception;

public class IllegalCapacity extends Exception{
    int capacity;

    public IllegalCapacity(String message){
        super(message);
    }
}
