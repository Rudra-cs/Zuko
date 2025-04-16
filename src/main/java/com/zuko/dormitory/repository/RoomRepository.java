package com.zuko.dormitory.repository;

import com.zuko.dormitory.model.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
