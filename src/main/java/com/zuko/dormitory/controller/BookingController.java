package com.zuko.dormitory.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @PostMapping
    public ResponseEntity<?> createBooking(@RequestBody BookingRequest request) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/cancel")
    public ResponseEntity<?> cancelBooking(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> getBookings() {
        return ResponseEntity.ok().build();
    }
}