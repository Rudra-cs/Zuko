package com.zuko.dormitory.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/booking-guests")
public class BookingGuestController {

    @PostMapping
    public ResponseEntity<?> addGuest(@RequestBody BookingGuestRequest request) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/booking/{bookingId}")
    public ResponseEntity<?> getGuestsByBooking(@PathVariable Long bookingId) {
        return ResponseEntity.ok().build();
    }
}