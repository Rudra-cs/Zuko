package com.zuko.dormitory.model.entity;

import com.zuko.dormitory.model.common.BaseEntity;
import com.zuko.dormitory.model.enums.Berth;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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

    @NotNull(message = "Age cannot be empty.")
    @Enumerated(EnumType.STRING)
    @NotNull(message = "Age cannot be empty.")
    private Berth berth;
    @NotNull(message = "Age cannot be empty.")
    private boolean isAvailable;
    @NotEmpty(message = "Age cannot be empty.")
    private String description;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
