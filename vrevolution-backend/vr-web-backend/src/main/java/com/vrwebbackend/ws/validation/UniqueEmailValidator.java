package com.vrwebbackend.ws.validation;

import com.vrwebbackend.ws.user.User;
import com.vrwebbackend.ws.user.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.Annotation;

public class UniqueEmailValidator implements ConstraintValidator <UniqueEmail,String>
{
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context)
    {
        User inDB = userRepository.findByEmail(value);
        return (inDB == null);
    }
}
