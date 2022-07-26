package com.nftbe.models.DTO;

import lombok.Data;

@Data
public class SkillDTO {
    private int id;
    private String skillThumbnail;
    private int skillLevel;
    private int skillDame;
    private int skillDef;
    private String skillNote;

    private SkillDTO(Builder builder) {
        this.id = builder.id;
        this.skillThumbnail = builder.skillThumbnail;
        this.skillLevel = builder.skillLevel;
        this.skillDame = builder.skillDame;
        this.skillDef = builder.skillDef;
        this.skillNote = builder.skillNote;
    }

    public static class Builder {
        private int id;
        private String skillThumbnail;
        private int skillLevel;
        private int skillDame;
        private int skillDef;
        private String skillNote;

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

        public SkillDTO build() {
            return new SkillDTO(this);
        }
    }
}
