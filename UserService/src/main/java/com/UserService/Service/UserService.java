package com.UserService.Service;

import com.UserService.Enity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    UserEntity createUser(UserEntity userEntity);

    UserEntity updateUser(UserEntity userEntity);

    UserEntity findById(Long id);

    UserEntity findByUserName(String userName);

    List<UserEntity> findAllUsers();
}
