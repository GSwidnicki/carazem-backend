package com.carazem.ride;

import com.carazem.ride.dto.SearchRequestDto;
import com.carazem.ride.dto.SearchResponseDto;
import com.carazem.web.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
@RequestMapping(value = "/rides")
public class RideController {

    @Autowired
    private RideService rideService;

    @Autowired
    private RideValidator rideValidator;

    @RequestMapping(method = GET)
    public List<SearchResponseDto> search(SearchRequestDto searchRequestDto) {

        return rideService.searchRides(searchRequestDto);
    }

    @RequestMapping(method = POST)
    public void addRide(@RequestBody @Validated Ride ride) {
         rideService.addRide(ride);
    }

    @InitBinder("ride")
    public void initRideValidator(WebDataBinder binder) {
        binder.addValidators(rideValidator);
    }
}
