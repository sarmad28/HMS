package com.HotelService.Controller;

import com.HotelService.DTO.HotelDTO;
import com.HotelService.Entity.HotelEntity;
import com.HotelService.Service.HotelService;
import com.HotelService.Transformer.HotelTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    HotelService hotelService;

    @PostMapping("/create")
    public ResponseEntity createHotel(@ModelAttribute HotelDTO hotelDTO) {
        try {
            HotelEntity hotel = hotelService.findById(Long.valueOf(hotelDTO.getId()));
            if (hotel != null) {
                return new ResponseEntity("Hotel already Exist", HttpStatus.OK);
            }
            HotelEntity hotelEntity = HotelTransformer.getHotelEntity(hotelDTO);
            HotelEntity hotelEntity1 = hotelService.createHotel(hotelEntity);
            HotelDTO hotelDTO1 = HotelTransformer.getHotelDTO(hotelEntity1);
            return new ResponseEntity<>(hotelDTO1, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Exception occurred!", HttpStatus.OK);
        }
    }
}
