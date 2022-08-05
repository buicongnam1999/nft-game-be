package com.nftbe.parsers;

import com.nftbe.exceptions.AppException;
import com.nftbe.models.DTO.SkillDTO;
import com.nftbe.models.Skill;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;

import static com.nftbe.utils.Constants.ERROR_FORMAT;

public class SkillParser extends BaseParser<Skill, SkillDTO> {
    @Override
    public Skill convertJson(SkillDTO skillDTO) {
        return new Skill.Builder()
                .id(skillDTO.getId())
                .skillThumbnail(skillDTO.getSkillThumbnail())
                .skillLevel(skillDTO.getSkillLevel())
                .skillDame(skillDTO.getSkillDame())
                .skillDef(skillDTO.getSkillDef())
                .skillNote(skillDTO.getSkillNote())
                .build();
    }

    @Override
    public Skill convertJson(String json) {
        try {
            JSONObject nftJson = new JSONObject(json);
            return new Skill.Builder()
                    .id(getInt(nftJson, "id"))
                    .skillThumbnail(getString(nftJson, "skillThumbnail"))
                    .skillLevel(getInt(nftJson, "skillLevel"))
                    .skillDame(getInt(nftJson, "skillDame"))
                    .skillDef(getInt(nftJson, "skillDef"))
                    .skillNote(getString(nftJson, "skillNote"))
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }

    @Override
    public SkillDTO convertObject(Skill skill) {
        return new SkillDTO.Builder()
                .id(skill.getId())
                .skillThumbnail(skill.getSkillThumbnail())
                .skillLevel(skill.getSkillLevel())
                .skillDame(skill.getSkillDame())
                .skillDef(skill.getSkillDef())
                .skillNote(skill.getSkillNote())
                .build();
    }


}
