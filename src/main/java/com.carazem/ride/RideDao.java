package com.carazem.ride;

import com.carazem.ride.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface RideDao extends JpaRepository<Ride, Long>{

    List<Ride>findByCityFromAndCityToAndRideDateGreaterThan(String cityFrom, String cityTo, Timestamp rideDate);


}
