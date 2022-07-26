package com.nftbe.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class AppException extends RuntimeException {
    public HttpStatus code;
    public String message;
}
