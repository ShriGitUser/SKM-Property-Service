package com.skm.property.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class PropertyTypeUnsupportedException extends RuntimeException{
    public PropertyTypeUnsupportedException(String message) {
        super(message);
    }
}
