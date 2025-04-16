package com.zuko.dormitory.repository;

import com.zuko.dormitory.model.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
