package com.RatingService.Controller;

import com.RatingService.DTO.RatingDTO;
import com.RatingService.Entity.RatingEntity;
import com.RatingService.Service.RatingService;
import com.RatingService.Transformer.RatingTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingConroller {

    @Autowired
    RatingService ratingService;

    @PostMapping("/create")
    public ResponseEntity create(RatingDTO ratingDTO) {
        if (ratingDTO == null) {
            return new ResponseEntity(ratingDTO, HttpStatus.OK);
        }
        RatingEntity ratingEntity = RatingTransformer.getRatingEntity(ratingDTO);
        RatingEntity ratingEntity1 = ratingService.create(ratingEntity);
        return new ResponseEntity(RatingTransformer.getRatingDTO(ratingEntity1), HttpStatus.OK);
    }
}
