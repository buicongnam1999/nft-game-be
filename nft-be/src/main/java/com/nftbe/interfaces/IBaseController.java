package com.nftbe.interfaces;

import com.nftbe.models.response.ResponseObject;
import org.springframework.http.ResponseEntity;

public interface IBaseController<T> {
    ResponseEntity<ResponseObject> getAll();
    ResponseEntity<ResponseObject> getByPage(int page);
    ResponseEntity<ResponseObject> update(T t);
    ResponseEntity<ResponseObject> create(T t);
    ResponseEntity<ResponseObject> delete(T t);
}
