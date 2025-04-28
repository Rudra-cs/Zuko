package com.zuko.dormitory.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.zuko.dormitory.model.common.BaseEntity;
import com.zuko.dormitory.model.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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

    @NotNull(message = "StartDate cannot be empty.")
    private LocalDate startDate;
    @NotNull(message = "EndDate cannot be empty.")
    private LocalDate endDate;

    private String notes;
    @NotNull(message = "Payment Mode cannot be empty.")
    private String paymentMode;
    @NotNull(message = "Total Amount cannot be empty.")
    private Double totalAmount;

    @NotNull(message = "Status cannot be empty.")
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
