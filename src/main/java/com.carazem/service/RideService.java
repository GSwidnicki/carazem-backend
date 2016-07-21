package com.carazem.service;

import com.carazem.dao.RideDao;
import com.carazem.dao.UserDao;
import com.carazem.model.Ride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class RideService {

    @Autowired
    private RideDao rideDao;

    @Autowired
    private UserDao userDao;

    public List<SearchResponseDto> searchRides(SearchRequestDto searchRequestDto) {
       return rideDao.findByCityFromAndCityToAndRideDateGreaterThan(searchRequestDto.getCityFrom(), searchRequestDto.getCityTo(), searchRequestDto.getRideDate())
               .stream().map(r->new SearchResponseDto(r)).collect(toList());
    }

}