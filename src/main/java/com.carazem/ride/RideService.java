package com.carazem.ride;

import com.carazem.config.SecurityService;
import com.carazem.ride.dto.SearchRequestDto;
import com.carazem.ride.dto.SearchResponseDto;
import com.carazem.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class RideService {

    @Autowired
    private RideDao rideDao;

    @Autowired
    private UserRideDao userRideDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private SecurityService securityService;

    public List<SearchResponseDto> searchRides(SearchRequestDto searchRequestDto) {
        if (searchRequestDto.getUserId() == null) {
            return rideDao.findByCityFromAndCityToAndRideDateGreaterThan(searchRequestDto.getCityFrom(), searchRequestDto.getCityTo(), searchRequestDto.getRideDate())
                    .stream().map(SearchResponseDto::new).collect(toList());
        }
        return userRideDao.findByDriverId(searchRequestDto.getUserId())
                .stream().map(SearchResponseDto::new).collect(toList());
    }

    public Ride addRide(Ride ride) {
        ride.setDriver(userDao.getOne(securityService.currentUserId()));
        rideDao.save(ride);
        return ride;
    }


}