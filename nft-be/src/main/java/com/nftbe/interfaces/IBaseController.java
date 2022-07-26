package com.nftbe.interfaces;

import com.nftbe.models.response.ResponseObject;
import org.springframework.http.ResponseEntity;

public interface IBaseController<T> {
    ResponseEntity<ResponseObject> getAll();
    ResponseEntity<ResponseObject> getByPage(int page);
}
