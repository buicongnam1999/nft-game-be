package com.nftbe.services;

import com.nftbe.models.Skill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService implements IBaseService<Skill> {
    @Override
    public List<Skill> getAll() {
        return null;
    }

    @Override
    public Skill findById(int id) {
        return null;
    }

    @Override
    public Skill update(Skill skill) {
        return null;
    }

    @Override
    public Skill create(Skill skill) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
