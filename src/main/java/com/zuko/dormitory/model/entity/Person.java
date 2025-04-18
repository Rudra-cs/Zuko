package com.zuko.dormitory.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.zuko.dormitory.model.common.BaseEntity;
import com.zuko.dormitory.model.enums.Role;
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
public class Person extends BaseEntity {

    private String name;
    private String email;
    private String phone;
    private Integer age;
    private String gender;
    private String address;
    @Enumerated(EnumType.STRING)
    private Role role; // ADMIN or CONSUMER

    @JsonManagedReference
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Booking> bookings;
}
