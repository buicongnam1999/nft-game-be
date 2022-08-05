package com.nftbe.controllers;

import com.nftbe.interfaces.IBaseController;
import com.nftbe.models.DTO.SkillDTO;
import com.nftbe.models.Skill;
import com.nftbe.models.response.ResponseObject;
import com.nftbe.repositories.ISkillRepository;
import com.nftbe.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "api/v1/nft/skill")
@CrossOrigin(origins = "http://localhost:3000")
public class SkillController implements IBaseController<SkillDTO> {
    @Autowired
    private SkillService skillService;

    @GetMapping(value = "")
    @Override
    public ResponseEntity<ResponseObject> getAll() {
        return new ResponseEntity<>(new ResponseObject(true, "", skillService.getAll()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseObject> getByPage(int page) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseObject> update(SkillDTO skillDTO) {

        return null;
    }

    @Override
    public ResponseEntity<ResponseObject> create(SkillDTO skillDTO) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseObject> delete(SkillDTO skillDTO) {
        return null;
    }

}
