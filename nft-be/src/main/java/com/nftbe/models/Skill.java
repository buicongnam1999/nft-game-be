package com.nftbe.models;

import javax.persistence.*;

@Entity
@Table(name = "tblSkill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private int id;
    @Column(name = "skill_thumbnail")
    private String skillThumbnail;
    @Column(name = "skill_level")
    private int skillLevel;
    @Column(name = "skill_dame")
    private int skillDame;
    @Column(name = "skill_def")
    private int skillDef;
    @Column(name = "skill_note")
    private String skillNote;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkillThumbnail() {
        return skillThumbnail;
    }

    public void setSkillThumbnail(String skillThumbnail) {
        this.skillThumbnail = skillThumbnail;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public int getSkillDame() {
        return skillDame;
    }

    public void setSkillDame(int skillDame) {
        this.skillDame = skillDame;
    }

    public int getSkillDef() {
        return skillDef;
    }

    public void setSkillDef(int skillDef) {
        this.skillDef = skillDef;
    }

    public String getSkillNote() {
        return skillNote;
    }

    public void setSkillNote(String skillNote) {
        this.skillNote = skillNote;
    }
}
