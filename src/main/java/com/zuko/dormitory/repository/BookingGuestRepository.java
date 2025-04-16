package com.zuko.dormitory.repository;

import com.zuko.dormitory.model.BookingGuest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingGuestRepository extends JpaRepository<BookingGuest,Long> {
}
