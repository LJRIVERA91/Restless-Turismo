package com.example.demo.repositories;

import com.example.demo.Entities.Bookings;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Bookings,Long> {
        //Bookings findbyUser(long  id);
}
