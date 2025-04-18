package com.zuko.dormitory.model.entity;

import com.zuko.dormitory.model.common.BaseEntity;
import com.zuko.dormitory.model.enums.Berth;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RoomBed extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private Berth berth;
    private boolean isAvailable;
    private String description;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
