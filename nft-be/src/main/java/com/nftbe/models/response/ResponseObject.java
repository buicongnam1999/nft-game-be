package com.nftbe.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseObject {
    private boolean status;
    private String message;
    private Object data;
}
