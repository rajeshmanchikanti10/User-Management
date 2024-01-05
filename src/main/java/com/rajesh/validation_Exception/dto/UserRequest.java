package com.rajesh.validation_Exception.dto;

import com.rajesh.validation_Exception.entity.User;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "User name shouldn't be null")
    private String name;
    @Email(message = "email should have mail.com")
    private String email;
    @Pattern(regexp = "^\\d{10}$",message = "mobile number should be of 10 digits")
    private String mobile;
    private String gender;
    @Min(15)
    @Max(60)
    private int age;
    private String nationality;
    public static User toDTO(UserRequest userRequest) {
        return User.builder()
                .name(userRequest.name)
                .email(userRequest.email)
                .mobile(userRequest.mobile)
                .gender(userRequest.gender)
                .age(userRequest.age)
                .nationality(userRequest.nationality)
                .build();
    }
}
