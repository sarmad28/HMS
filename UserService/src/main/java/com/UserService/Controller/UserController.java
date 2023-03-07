package com.UserService.Controller;

import com.UserService.DTO.UserDTO;
import com.UserService.Enity.UserEntity;
import com.UserService.Service.UserService;
import com.UserService.Transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/create")
    public ResponseEntity createUser(@ModelAttribute UserDTO userDTO) {
        try {
            UserEntity user = userService.findByUserName(userDTO.getUserName());
            if (user != null) {
                return new ResponseEntity("User already Exist", HttpStatus.OK);
            }
            UserEntity userEntity = UserTransformer.getUserEntity(userDTO);
            UserEntity userEntity1 = userService.createUser(userEntity);
            UserDTO userDTO1 = UserTransformer.getUserDTO(userEntity1);
            return new ResponseEntity<>(userDTO1,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Exception occurred!", HttpStatus.OK);
        }
    }
}
