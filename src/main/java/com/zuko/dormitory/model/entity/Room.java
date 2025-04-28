package com.zuko.dormitory.model.entity;

import com.zuko.dormitory.model.common.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Room extends BaseEntity {

    @NotEmpty(message = "Room number cannot be empty.")
    private String roomNo;
    @NotNull(message = "Floor cannot be empty.")
    private int floor;
    @NotNull(message = "AC cannot be empty.")
    private boolean ac;
    @NotEmpty(message = "Description cannot be empty.")
    private String description;
    @NotEmpty(message = "Room Type cannot be empty.")
    private String roomType; // BED_4, BED_6 etc.
    @NotNull(message = "Availability cannot be empty.")
    private boolean isAvailable;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RoomBed> beds;
}
