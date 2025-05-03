package com.zuko.dormitory.controller;

import com.zuko.dormitory.model.request.BookingRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Booking Controller", description = "API's related to Booking.")
@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Operation(summary = "Get a person by ID", description = "Returns a single person")
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