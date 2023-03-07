package com.UserService.ServiceImpl;

import com.UserService.Enity.UserEntity;
import com.UserService.Repository.UserRepository;
import com.UserService.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        if (userEntity.getId() != null) {
            UserEntity persisted = findById(userEntity.getId());
            if (persisted == null) {
                return null;
            }
            UserEntity updated = userRepository.save(userEntity);
            return updated;
        }
        return null;
    }

    @Override
    public UserEntity findById(Long id) {
        Optional<UserEntity> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        }
        return null;
    }

    @Override
    public UserEntity findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
