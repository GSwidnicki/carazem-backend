package com.carazem.ride;

import com.carazem.auth.SecurityService;
import com.carazem.ride.dto.SearchRequestDto;
import com.carazem.ride.dto.SearchResponseDto;
import com.carazem.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    public List<SearchResponseDto> searchRides(SearchRequestDto searchRequestDto, Pageable pageable) {
        if (searchRequestDto.getUserId() == null) {
            return rideDao.findByCityFromAndCityToAndRideDateGreaterThan(searchRequestDto.getCityFrom(), searchRequestDto.getCityTo(), searchRequestDto.getRideDate(), pageable)
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

    public boolean rideExists(Ride ride) {
        ride.setDriver(userDao.getOne(securityService.currentUserId()));
        Ride fetched = rideDao.findByDriverIdAndRideDate(ride.getDriver().getId(), ride.getRideDate());
        return fetched!=null;
    }


}