package com.HotelService.Service;

import com.HotelService.Entity.HotelEntity;

public interface HotelService {
    HotelEntity createHotel(HotelEntity hotelEntity);

    HotelEntity updateHotel(HotelEntity hotelEntity);

    HotelEntity findById(Long id);
}
