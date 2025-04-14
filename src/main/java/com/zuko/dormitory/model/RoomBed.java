package com.zuko.dormitory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomBed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String berth; // upper / middle / lower
    private boolean isAvailable;
    private String description;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
