package com.nftbe.services;

import com.nftbe.models.DTO.SkillDTO;
import com.nftbe.models.Skill;
import com.nftbe.parsers.SkillParser;
import com.nftbe.repositories.ISkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillService implements IBaseService<SkillDTO> {
    @Autowired
    private ISkillRepository skillRepository;
    private SkillParser skillParser = new SkillParser();

    @Override
    public List<SkillDTO> getAll() {
        List<Skill> skills =  skillRepository.findAll();
        List<SkillDTO> skillDTOS = new ArrayList<>();
        for (Skill skill:
            skills) {
            SkillDTO skillDTO = skillParser.convertObject(skill);
            skillDTOS.add(skillDTO);
        }
        return skillDTOS;
    }

    @Override
    public SkillDTO findById(int id) {
        return null;
    }

    @Override
    public SkillDTO update(SkillDTO skillDTO) {

        return null;
    }

    @Override
    public SkillDTO create(SkillDTO skillDTO) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<SkillDTO> getByPage(int page) {
        return null;
    }
}
