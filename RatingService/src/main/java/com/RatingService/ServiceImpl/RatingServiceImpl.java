package com.RatingService.ServiceImpl;

import com.RatingService.Entity.RatingEntity;
import com.RatingService.Repository.RatingRepository;
import com.RatingService.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    RatingRepository ratingRepository;
    @Override
    public RatingEntity create(RatingEntity ratingEntity) {
        return ratingRepository.save(ratingEntity);
    }
}
