package com.carazem.controller;

import com.carazem.model.Ride;
import com.carazem.rideDto.SearchRequestDto;
import com.carazem.rideDto.SearchResponseDto;
import com.carazem.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by RENT on 2016-07-21.
 */

@RestController
public class RideController {

    @Autowired
    private RideService rideService;

    @RequestMapping(value = "/search", method = GET)
    public List<SearchResponseDto> search( SearchRequestDto searchRequestDto){
        return rideService.searchRides(searchRequestDto);
    }

    @RequestMapping(value = "/addride", method = POST)
    public Ride addRide(Ride ride){
        rideService.addRide(ride);
        return ride;
    }
}
