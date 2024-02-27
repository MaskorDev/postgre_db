package com.example.postgre.service;

import com.example.postgre.entity.UserEntity;
import com.example.postgre.repository.UserRepository;
import com.example.postgre.source.Source;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UserService{
    public static final Random random = new Random();
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ArrayList<UserEntity> fillDataBase() {
        ArrayList<UserEntity> userEntityList = new ArrayList<>();


        for (int i = 0; i < 5000; i++) {
            UserEntity user = UserEntity.builder()
                    .firstName(Source.femaleNames[random.nextInt(Source.femaleNames.length)])
                    .lastName(Source.femaleLastName[random.nextInt(Source.femaleLastName.length)])
                    .build();

            userEntityList.add(user);

            userRepository.save(user);
        }

        for (int i = 0; i < 5000; i++) {
            UserEntity user = UserEntity.builder()
                    .firstName(Source.maleNames[random.nextInt(Source.maleNames.length)])
                    .lastName(Source.maleLastName[random.nextInt(Source.maleLastName.length)])
                    .build();

            userEntityList.add(user);

            userRepository.save(user);
        }

        return userEntityList;
    }
}
