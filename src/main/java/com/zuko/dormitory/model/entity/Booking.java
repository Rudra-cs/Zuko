package com.zuko.dormitory.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.zuko.dormitory.model.common.BaseEntity;
import com.zuko.dormitory.model.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Booking extends BaseEntity {


    private LocalDate startDate;
    private LocalDate endDate;
    private String notes;
    private String paymentMode;
    private Double totalAmount;

    @Enumerated(EnumType.STRING)
    private Status status; // CONFIRMED / CANCELLED / COMPLETED

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @JsonManagedReference
    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BookingGuest> guests;
}
