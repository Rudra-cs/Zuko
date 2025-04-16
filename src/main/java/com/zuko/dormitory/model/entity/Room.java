package com.zuko.dormitory.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomNo;
    private int floor;
    private boolean ac;
    private String description;
    private String roomType; // 4-bed, 6-bed etc.
    private boolean isAvailable;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<RoomBed> beds;
}
