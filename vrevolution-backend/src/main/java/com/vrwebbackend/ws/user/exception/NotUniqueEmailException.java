package com.vrwebbackend.ws.user.exception;

import com.vrwebbackend.ws.shared.Messages;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Collections;
import java.util.Map;

public class NotUniqueEmailException extends RuntimeException
{

    public Map<String, String> getValidationErrors(){
        return Collections.singletonMap("email", Messages.getMessageForLocale("vrwebbackend.constraint.email.notunique", LocaleContextHolder.getLocale()));
    }
}
