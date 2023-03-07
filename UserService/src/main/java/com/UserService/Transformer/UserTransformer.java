package com.UserService.Transformer;

import com.UserService.DTO.UserDTO;
import com.UserService.Enity.UserEntity;

public class UserTransformer {

    public static UserEntity getUserEntity(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        if (userDTO.getId() != null) {
            userEntity.setId(Long.valueOf(userDTO.getId()));
        }
        if (userDTO.getUserName() != null) {
            userEntity.setUserName(userDTO.getUserName());
        }
        if (userDTO.getUserPassword() != null) {
            userEntity.setUserPassword(userDTO.getUserPassword());
        }
        if (userDTO.getCnic() != null) {
            userEntity.setCnic(userDTO.getCnic());
        }
        return userEntity;
    }

    public static UserDTO getUserDTO(UserEntity userEntity) {
        UserDTO userDTO = new UserDTO();
        if (userEntity.getId() != null) {
            userDTO.setId(String.valueOf(userEntity.getId()));
        }
        if (userEntity.getUserName() != null) {
            userDTO.setUserName(userEntity.getUserName());
        }
        if (userEntity.getUserPassword() != null) {
            userDTO.setUserPassword(userEntity.getUserPassword());
        }
        if (userEntity.getCnic() != null) {
            userDTO.setCnic(userEntity.getCnic());
        }
        return userDTO;
    }
}
