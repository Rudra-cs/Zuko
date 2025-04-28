package com.zuko.dormitory.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.zuko.dormitory.model.common.BaseEntity;
import com.zuko.dormitory.model.enums.Role;
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
public class Person extends BaseEntity {

    @NotEmpty(message = "Name cannot be empty.")
    private String name;
    @NotEmpty(message = "Email cannot be empty.")
    private String email;
    @NotEmpty(message = "Phone number cannot be empty.")
    private String phone;
    @NotNull(message = "Age cannot be empty.")
    private Integer age;
    @NotEmpty(message = "Gender cannot be empty.")
    private String gender;
    @NotEmpty(message = "Address cannot be empty.")
    private String address;
    @NotNull(message = "Role cannot be empty.")
    @Enumerated(EnumType.STRING)
    private Role role; // ADMIN or CONSUMER

    @JsonManagedReference
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Booking> bookings;
}
