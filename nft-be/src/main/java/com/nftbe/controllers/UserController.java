package com.nftbe.controllers;

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
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public ResponseEntity<ResponseObject> getAllWallet() {
        return new ResponseEntity<>(new ResponseObject(true, "", userService.getAll()), HttpStatus.OK);
    }
}
