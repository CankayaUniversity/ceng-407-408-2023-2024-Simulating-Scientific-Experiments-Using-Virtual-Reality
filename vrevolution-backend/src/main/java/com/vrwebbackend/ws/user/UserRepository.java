package com.vrwebbackend.ws.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long>
{
    User findByEmail(String email);

    long count();

    List<User> findAll();
}
