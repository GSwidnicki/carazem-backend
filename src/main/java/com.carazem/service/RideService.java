package com.carazem.service;

import com.carazem.dao.RideDao;
import com.carazem.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideService {

    @Autowired
    private RideDao rideDao;

    @Autowired
    private UserDao userDao;

    public List<SearchRespnseDto> searchRides(SearchRequestDto searchRequestDto) {


        return ;
    }

}