package com.carazem.ride;

import com.carazem.ride.Ride;
import com.carazem.user.User;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface RideDao extends JpaRepository<Ride, Long> {

    List<Ride> findByCityFromAndCityToAndRideDateGreaterThan(String cityFrom, String cityTo, Timestamp rideDate, Pageable pageable);


    Ride findByDriverIdAndRideDate(Long id, Timestamp rideDate);
}
