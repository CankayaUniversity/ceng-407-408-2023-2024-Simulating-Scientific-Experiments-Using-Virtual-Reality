package com.vrwebbackend.ws.user.dto;

import com.vrwebbackend.ws.user.User;
import com.vrwebbackend.ws.validation.UniqueEmail;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UserCreate(
        @NotBlank
        @Size(min = 4,max = 255)
        String username,

        @NotBlank
        @Email
        @UniqueEmail
        String email,

        @Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$")
        String password
)
{
    public User toUser()
    {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setUsername(username);
        return user;
    }
}
