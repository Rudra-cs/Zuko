package com.zuko.dormitory.repository;

import com.zuko.dormitory.model.entity.BookingGuest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookingGuestRepository extends JpaRepository<BookingGuest,Long> {
}
