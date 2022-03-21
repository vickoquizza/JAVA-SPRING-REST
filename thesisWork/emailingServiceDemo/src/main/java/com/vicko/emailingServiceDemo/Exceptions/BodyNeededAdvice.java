package com.vicko.emailingServiceDemo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BodyNeededAdvice {

    @ResponseBody
    @ExceptionHandler(BodyNeededException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String BodyNeededHandler(BodyNeededException ex){
        return ex.getMessage();
    }
}
