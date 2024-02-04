package com.vrwebbackend.ws.user;

import com.vrwebbackend.ws.user.dto.UserData;
import com.vrwebbackend.ws.user.exception.NotUniqueEmailException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.mail.MailException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService
{
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Transactional(rollbackOn = MailException.class)
    public void save(User user)
    {
        try
        {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.save(user);
        }
        catch (DataIntegrityViolationException ex)
        {
            throw new NotUniqueEmailException();
        }
    }

    public User findByEmail(String email)
    {
        return userRepository.findByEmail(email);
    }

    public Optional<User> findById(Long id)
    {
        return userRepository.findById(id);
    }

    public long getUserCount() {
        return userRepository.count();
    }

    public List<UserData> getAllUsernamesAndEmails() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> new UserData(user.getUsername(), user.getEmail()))
                .collect(Collectors.toList());
    }
}
