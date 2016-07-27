package com.carazem.ride;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRideDao extends JpaRepository<Ride, Long> {
    List<Ride> findByDriverId(Long id);
}
