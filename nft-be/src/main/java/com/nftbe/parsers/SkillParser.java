package com.nftbe.parsers;

import com.nftbe.models.DTO.SkillDTO;
import com.nftbe.models.Skill;

public class SkillParser extends BaseParser<Skill, SkillDTO> {
    @Override
    public Skill convertJson(SkillDTO skillDTO) {
        return null;
    }

    @Override
    public Skill convertJson(String json) {
        return null;
    }
}
