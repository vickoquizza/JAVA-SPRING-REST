package com.vicko.emailingServiceDemo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PrimaryRecipientNeededAdvice {

    @ResponseBody
    @ExceptionHandler(PrimaryRecipientNeededException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String PrimaryRecipientNeededHandler(PrimaryRecipientNeededException ex){
        return ex.getMessage();
    }
}
