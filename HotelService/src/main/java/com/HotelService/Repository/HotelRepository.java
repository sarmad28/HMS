package com.HotelService.Repository;

import com.HotelService.Entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HotelRepository extends JpaSpecificationExecutor<HotelEntity>, JpaRepository<HotelEntity, Long> {
}
