package com.carazem.service;

import com.carazem.dao.RideDao;
import com.carazem.dao.UserDao;
import com.carazem.model.Ride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService {

    @Autowired
    private RideDao rideDao;

    @Autowired
    private UserDao userDao;

    public List<Ride> searchRides() {

        List<Ride> rideList = rideDao.findAll();

        return rideList;
    }

}