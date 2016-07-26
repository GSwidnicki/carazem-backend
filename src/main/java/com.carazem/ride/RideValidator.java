package com.carazem.ride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class RideValidator implements Validator{

    @Autowired
    private RideService rideService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Ride.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Ride ride = (Ride) target;


        if(rideService.rideExists(ride)) {
            errors.reject("Przejazd istnieje"); //TODO
        }

        //TODO - date in future

    }
}
