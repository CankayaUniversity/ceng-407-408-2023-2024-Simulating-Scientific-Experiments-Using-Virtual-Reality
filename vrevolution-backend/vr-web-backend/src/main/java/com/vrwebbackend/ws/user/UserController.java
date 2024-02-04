package com.vrwebbackend.ws.user;

import com.vrwebbackend.ws.error.ApiError;
import com.vrwebbackend.ws.shared.GenericMessage;
import com.vrwebbackend.ws.shared.Messages;
import com.vrwebbackend.ws.user.dto.UserCreate;
import com.vrwebbackend.ws.user.dto.UserData;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @PostMapping("/api/v1/users")
    GenericMessage createUser(@Valid @RequestBody UserCreate user)
    {
        userService.save(user.toUser());
        return new GenericMessage("User is created successfully");
    }

    @GetMapping("/api/v1/user-count")
    public ResponseEntity<Long> getUserCount()
    {
        long userCount = userService.getUserCount();
        return ResponseEntity.ok(userCount);
    }

    @GetMapping("/api/v1/all-usernames-emails")
    public ResponseEntity<List<UserData>> getAllUsernamesAndEmails()
    {
        List<UserData> userData = userService.getAllUsernamesAndEmails();
        return ResponseEntity.ok(userData);
    }
}
