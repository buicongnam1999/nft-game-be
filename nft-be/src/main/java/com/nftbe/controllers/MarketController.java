package com.nftbe.controllers;

import com.nftbe.interfaces.IBaseController;
import com.nftbe.models.DTO.MarketDTO;
import com.nftbe.models.Market;
import com.nftbe.models.response.ResponseObject;
import com.nftbe.services.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

import static com.nftbe.utils.Constants.DATA_NOT_FOUND;

@Controller
@RequestMapping(path = "api/v1/marketplace/nft-sale")
@CrossOrigin(origins = "*")
public class MarketController implements IBaseController<MarketDTO> {
    @Autowired
    private MarketService marketService;

    @CrossOrigin
    @GetMapping(value = "")
    @Override
    public ResponseEntity<ResponseObject> getAll() {
        return new ResponseEntity<>(new ResponseObject(true, "", marketService.getAll()), HttpStatus.OK);
    }

    @GetMapping(value = "page={page}")
    @Override
    public ResponseEntity<ResponseObject> getByPage(@PathVariable int page) {
        return new ResponseEntity<>(new ResponseObject(true, "", marketService.getByPage(page)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseObject> update(MarketDTO marketDTO) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseObject> create(MarketDTO marketDTO) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseObject> delete(MarketDTO marketDTO) {
        return null;
    }

    @GetMapping(value = "count")
    public ResponseEntity<ResponseObject> getCountSale() {
        return new ResponseEntity<>(new ResponseObject(true, "", marketService.getCountSale()), HttpStatus.OK);
    }

    @GetMapping(value = "findById/{id}")
    public ResponseEntity<ResponseObject> findById(@PathVariable int id) {
        Market market = marketService.findById(id);

        if (Objects.isNull(market)) {
            return new ResponseEntity<>(new ResponseObject(false, "", DATA_NOT_FOUND), HttpStatus.OK);
        }

        return new ResponseEntity<>(new ResponseObject(true, "", market), HttpStatus.OK);
    }

    @PostMapping(value = "findByArray")
    public ResponseEntity<ResponseObject> findByArray(@RequestBody String json) {
        return new ResponseEntity<>(new ResponseObject(true, "", marketService.getCountSale()), HttpStatus.OK);
    }

    @GetMapping(value = "sortPrice/{type}")
    public ResponseEntity<ResponseObject> sortPrice(@PathVariable int type) {
        return new ResponseEntity<>(new ResponseObject(true, "", marketService.sortPrice(type)), HttpStatus.OK);
    }
}
