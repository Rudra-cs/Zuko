package com.zuko.dormitory.model.entity;

import com.zuko.dormitory.model.common.BaseEntity;
import jakarta.persistence.*;
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

    private String roomNo;
    private int floor;
    private boolean ac;
    private String description;
    private String roomType; // BED_4, BED_6 etc.
    private boolean isAvailable;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RoomBed> beds;
}
