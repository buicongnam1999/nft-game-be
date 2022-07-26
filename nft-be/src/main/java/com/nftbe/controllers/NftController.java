package com.nftbe.controllers;

import com.nftbe.interfaces.IBaseController;
import com.nftbe.models.Nft;
import com.nftbe.models.response.ResponseObject;
import com.nftbe.services.NftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "api/v1/nft")
public class NftController implements IBaseController<Nft> {
    @Autowired
    private NftService nftService;


    @GetMapping(value = "list-item-nft")
    @Override
    public ResponseEntity<ResponseObject> getAll() {
        return new ResponseEntity<>(new ResponseObject(true, "", nftService.getAll()), HttpStatus.OK);
    }

    @GetMapping(value = "list-item-nft/page={page}")
    @Override
    public ResponseEntity<ResponseObject> getByPage(@PathVariable int page) {
        return new ResponseEntity<>(new ResponseObject(true, "", nftService.getByPage(page)), HttpStatus.OK);
    }
}
