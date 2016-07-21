package com.carazem.dao;

import com.carazem.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideDao extends JpaRepository<Ride, Long>{

}
