package com.RatingService.Transformer;

import com.RatingService.DTO.RatingDTO;
import com.RatingService.Entity.RatingEntity;

public class RatingTransformer {

    public static RatingEntity getRatingEntity(RatingDTO ratingDTO) {
        RatingEntity rating = new RatingEntity();
        if (ratingDTO.getId() != null) {
            rating.setId(Long.valueOf(ratingDTO.getId()));

        }
        if (ratingDTO.getRating() != null) {
            rating.setRating(Long.valueOf(ratingDTO.getRating()));
        }
        return rating;
    }

    public static RatingDTO getRatingDTO(RatingEntity ratingEntity) {
        RatingDTO ratingDTO = new RatingDTO();

        if (ratingEntity.getId() != null) {
            ratingDTO.setId(String.valueOf(ratingEntity.getId()));

        }
        if (ratingEntity.getRating() != null) {
            ratingDTO.setRating(String.valueOf(ratingEntity.getRating()));
        }
        return ratingDTO;
    }
}
