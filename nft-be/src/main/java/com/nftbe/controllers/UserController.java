package com.nftbe.controllers;

import com.nftbe.interfaces.IBaseController;
import com.nftbe.models.DTO.UserDTO;
import com.nftbe.models.User;
import com.nftbe.models.response.ResponseObject;
import com.nftbe.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "api/v1/user")
public class UserController implements IBaseController<UserDTO> {
    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    @Override
    public ResponseEntity<ResponseObject> getAll() {
        return new ResponseEntity<>(new ResponseObject(true, "", userService.getAll()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseObject> getByPage(int page) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseObject> update(UserDTO userDTO) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseObject> create(UserDTO userDTO) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseObject> delete(UserDTO userDTO) {
        return null;
    }

}
