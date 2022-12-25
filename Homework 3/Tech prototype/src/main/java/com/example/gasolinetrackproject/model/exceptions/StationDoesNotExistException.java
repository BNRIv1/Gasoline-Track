package com.example.gasolinetrackproject.model.exceptions;

public class StationDoesNotExistException extends RuntimeException{
    public StationDoesNotExistException(Long id){
        super(String.format("The station with id: %d does not exist", id));
    }
}
