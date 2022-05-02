package com.lal.AirlineMgtSys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lal.AirlineMgtSys.entity.Airline;

public interface AirlineRepo extends JpaRepository<Airline,Integer> {

}