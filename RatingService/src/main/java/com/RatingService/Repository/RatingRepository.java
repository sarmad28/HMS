package com.RatingService.Repository;

import com.RatingService.Entity.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RatingRepository extends JpaSpecificationExecutor, JpaRepository<RatingEntity,Long> {
}
