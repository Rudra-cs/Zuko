package com.zuko.dormitory.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.zuko.dormitory.model.common.BaseEntity;
import jakarta.persistence.*;
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

    private String guestName;
    private int guestAge;
    private String guestGender;
    private LocalDate guestStartDate;
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
