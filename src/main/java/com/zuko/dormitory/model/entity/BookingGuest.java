package com.zuko.dormitory.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.zuko.dormitory.model.common.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BookingGuest extends BaseEntity {

    @NotEmpty(message = "Guest name cannot be empty.")
    private String guestName;
    @NotNull(message = "Guest Age cannot be empty.")
    private int guestAge;
    @NotEmpty(message = "Guest Gender cannot be empty.")
    private String guestGender;
    @NotNull(message = "Guest Start Date cannot be empty.")
    private LocalDate guestStartDate;
    @NotNull(message = "Guest End Date cannot be empty.")
    private LocalDate guestEndDate;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "room_bed_id")
    private RoomBed roomBed;
}
