package com.vrwebbackend.ws.auth;

import com.vrwebbackend.ws.auth.dto.AuthResponse;
import com.vrwebbackend.ws.auth.dto.Credentials;
import com.vrwebbackend.ws.auth.exception.AuthenticationException;
import com.vrwebbackend.ws.error.ApiError;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController
{
    @Autowired
    AuthService authService;

    @PostMapping("/api/v1/auth")
    AuthResponse handleAuthentication(@Valid @RequestBody Credentials creds)
    {
        return authService.authenticate(creds);
    }
}
