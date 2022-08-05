package com.nftbe.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tblSkill")
@Data
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private int id;
    @Column(name = "skill_thumbnail")
    @NotNull
    private String skillThumbnail;
    @Column(name = "skill_level")
    @NotNull
    private int skillLevel;
    @Column(name = "skill_dame")
    @NotNull
    private int skillDame;
    @Column(name = "skill_def")
    @NotNull
    private int skillDef;
    @Column(name = "skill_note")
    @NotNull
    private String skillNote;

    public Skill(Builder builder) {
        this.id = builder.id;
        this.skillThumbnail = builder.skillThumbnail;
        this.skillLevel = builder.skillLevel;
        this.skillDame = builder.skillDame;
        this.skillDef = builder.skillDef;
        this.skillNote = builder.skillNote;
    }

    public Skill() {

    }

    public static class Builder {
        public int id;
        public String skillThumbnail;
        public int skillLevel;
        public int skillDame;
        public int skillDef;
        public String skillNote;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder skillThumbnail(String skillThumbnail) {
            this.skillThumbnail = skillThumbnail;
            return this;
        }

        public Builder skillLevel(int skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }

        public Builder skillDame(int skillDame) {
            this.skillDame = skillDame;
            return this;
        }

        public Builder skillDef(int skillDef) {
            this.skillDef = skillDef;
            return this;
        }

        public Builder skillNote(String skillNote) {
            this.skillNote = skillNote;
            return this;
        }

        public Skill build() {
            return new Skill(this);
        }

    }
}
