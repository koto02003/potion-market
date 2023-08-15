package com.junior_dev.PotionMarket.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class DataNotFoundException extends RuntimeException{

    private static final Long serialVersionUID = 1L;
    public DataNotFoundException(String message) {
        super(message);
    }
}
