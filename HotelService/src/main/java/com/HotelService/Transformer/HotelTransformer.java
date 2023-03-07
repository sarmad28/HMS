package com.HotelService.Transformer;

import com.HotelService.DTO.HotelDTO;
import com.HotelService.Entity.HotelEntity;

public class HotelTransformer {

    public static HotelEntity getHotelEntity(HotelDTO hotelDTO) {
        HotelEntity hotelEntity = new HotelEntity();

        if (hotelDTO.getId() != null) {
            hotelEntity.setId(hotelEntity.getId());
        }
        if (hotelDTO.getHotelName() != null) {
            hotelEntity.setHotelName(hotelEntity.getHotelName());
        }
        if (hotelDTO.getLocation() != null) {
            hotelEntity.setLocation(hotelEntity.getLocation());
        }
        if (hotelDTO.getAbout() != null) {
            hotelEntity.setAbout(hotelEntity.getAbout());
        }
        return hotelEntity;
    }

    public static HotelDTO getHotelDTO(HotelEntity hotelEntity) {
        HotelDTO hotelDTO = new HotelDTO();
        if (hotelEntity.getId() != null) {
            hotelDTO.setId(String.valueOf(hotelEntity.getId()));
        }
        if (hotelEntity.getHotelName() != null) {
            hotelDTO.setHotelName(hotelEntity.getHotelName());
        }
        if (hotelEntity.getLocation() != null) {
            hotelDTO.setLocation(hotelEntity.getLocation());
        }
        if (hotelEntity.getAbout() != null) {
            hotelDTO.setAbout(hotelEntity.getAbout());
        }
        return hotelDTO;
    }
}
