package com.HotelService.ServiceImpl;

import com.HotelService.Entity.HotelEntity;
import com.HotelService.Repository.HotelRepository;
import com.HotelService.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelRepository hotelRepository;

    @Override
    public HotelEntity createHotel(HotelEntity hotelEntity) {
        return hotelRepository.save(hotelEntity);
    }

    @Override
    public HotelEntity updateHotel(HotelEntity hotelEntity) {
        if (hotelEntity.getId() != null) {
            HotelEntity persisted = findById(hotelEntity.getId());
            if (persisted == null) {
                return null;
            }
            HotelEntity updated = hotelRepository.save(hotelEntity);
            return updated;
        }
        return null;
    }

    @Override
    public HotelEntity findById(Long id) {
        Optional<HotelEntity> optionalUser = hotelRepository.findById(id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        }
        return null;
    }
}
