package com.vrwebbackend.ws.auth.token;

import com.vrwebbackend.ws.auth.dto.Credentials;
import com.vrwebbackend.ws.user.User;

public interface TokenService
{
    public Token createToken(User user, Credentials creds);

    public User verifyToken(String authorizationHeader);
}
