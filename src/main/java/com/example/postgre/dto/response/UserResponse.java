package com.example.postgre.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
}
