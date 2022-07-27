package com.nftbe.controllers;

import com.nftbe.interfaces.IBaseController;
import com.nftbe.models.Market;
import com.nftbe.models.response.ResponseObject;
import com.nftbe.services.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "api/v1/marketplace")
public class MarketController implements IBaseController<Market> {
    @Autowired
    private MarketService marketService;

    @GetMapping(value = "nft-sale")
    @Override
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<ResponseObject> getAll() {
        return new ResponseEntity<>(new ResponseObject(true, "", marketService.getAll()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseObject> getByPage(int page) {
        return null;
    }
}
