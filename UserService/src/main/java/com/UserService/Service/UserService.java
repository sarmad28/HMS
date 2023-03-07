package com.UserService.Service;

import com.UserService.Enity.UserEntity;
import org.springframework.stereotype.Service;


public interface UserService {
    UserEntity createUser(UserEntity userEntity);

    UserEntity updateUser(UserEntity userEntity);

    UserEntity findById(Long id);

    UserEntity findByUserName(String userName);
}
