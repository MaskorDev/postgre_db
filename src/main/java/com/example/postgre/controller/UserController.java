package com.example.postgre.controller;

import com.example.postgre.entity.UserEntity;
import com.example.postgre.routes.Routes;
import com.example.postgre.service.UserService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(Routes.CREATE_ALL_USER)
    public ArrayList<UserEntity> fillDataBase() {
        ArrayList<UserEntity> arrayList = userService.fillDataBase();


        return arrayList;
    }

}
