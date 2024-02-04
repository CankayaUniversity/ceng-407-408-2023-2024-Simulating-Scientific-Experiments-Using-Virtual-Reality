package com.vrwebbackend.ws.auth;

import com.vrwebbackend.ws.auth.dto.AuthResponse;
import com.vrwebbackend.ws.auth.dto.Credentials;
import com.vrwebbackend.ws.auth.exception.AuthenticationException;
import com.vrwebbackend.ws.auth.token.Token;
import com.vrwebbackend.ws.auth.token.TokenService;
import com.vrwebbackend.ws.user.User;
import com.vrwebbackend.ws.user.UserService;
import com.vrwebbackend.ws.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    UserService userService;

    @Autowired
    TokenService tokenService;

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public AuthResponse authenticate(Credentials creds)
    {
        User inDB = userService.findByEmail(creds.email());
        if (inDB==null) throw new AuthenticationException();
        if (!passwordEncoder.matches(creds.password(),inDB.getPassword()))
        {
            throw new AuthenticationException();
        }
        Token token = tokenService.createToken(inDB,creds);
        AuthResponse authResponse = new AuthResponse();
        authResponse.setToken(token);
        authResponse.setUser(new UserDTO(inDB));
        return authResponse;
    }
}
