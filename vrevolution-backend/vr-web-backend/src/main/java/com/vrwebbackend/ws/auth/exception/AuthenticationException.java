package com.vrwebbackend.ws.auth.exception;

import com.vrwebbackend.ws.shared.GenericMessage;
import com.vrwebbackend.ws.shared.Messages;
import org.springframework.context.i18n.LocaleContextHolder;

public class AuthenticationException extends RuntimeException
{
    public AuthenticationException()
    {
        super(Messages.getMessageForLocale("vrwebbackend.auth.invalid.credentials",LocaleContextHolder.getLocale()));
    }
}
