package com.nftbe.models.DTO;

import lombok.Data;

@Data
public class NftDTO {
    private int id;
    private int nftType;
    private double nftPrice;
    private String nftDateCreate;
    private String nftThumbnail;
    private int nftLife;
    private int nftAttack;
    private int nftDef;
    private int nftSpeed;
    private int walletId;
    private int walletOldId;
    private int skillId;
    private int nftRarity;
    private int nftAge;

    private NftDTO(Builder builder) {
        this.id = builder.id;
        this.nftType = builder.nftType;;
        this.nftPrice = builder.nftPrice;
        this.nftDateCreate = builder.nftDateCreate;
        this.nftThumbnail = builder.nftThumbnail;
        this.nftLife = builder.nftLife;
        this.nftAttack = builder.nftAttack;
        this.nftDef = builder.nftDef;
        this.nftSpeed = builder.nftSpeed;
        this.walletId = builder.walletId;
        this.walletOldId = builder.walletOldId;
        this.skillId = builder.skillId;
        this.nftRarity = builder.nftRarity;
        this.nftAge = builder.nftAge;
    }

    public static class Builder {
        private int id;
        private int nftType;
        private double nftPrice;
        private String nftDateCreate;
        private String nftThumbnail;
        private int nftLife;
        private int nftAttack;
        private int nftDef;
        private int nftSpeed;
        private int walletId;
        private int walletOldId;
        private int skillId;
        private int nftRarity;
        private int nftAge;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder nftType(int nftType) {
            this.nftType = nftType;
            return this;
        }

        public Builder nftPrice(double nftPrice) {
            this.nftPrice = nftPrice;
            return this;
        }

        public Builder nftDateCreate(String nftDateCreate) {
            this.nftDateCreate = nftDateCreate;
            return this;
        }

        public Builder nftThumbnail(String nftThumbnail) {
            this.nftThumbnail = nftThumbnail;
            return this;
        }

        public Builder nftLife(int nftLife) {
            this.nftLife = nftLife;
            return this;
        }

        public Builder nftAttack(int nftAttack) {
            this.nftAttack = nftAttack;
            return this;
        }

        public Builder nftDef(int nftDef) {
            this.nftDef = nftDef;
            return this;
        }

        public Builder nftSpeed(int nftSpeed) {
            this.nftSpeed = nftSpeed;
            return this;
        }

        public Builder walletId(int walletId) {
            this.walletId = walletId;
            return this;
        }

        public Builder walletOldId(int walletOldId) {
            this.walletOldId = walletOldId;
            return this;
        }

        public Builder skillId(int skillId) {
            this.skillId = skillId;
            return this;
        }

        public Builder nftRarity(int nftRarity) {
            this.nftRarity = nftRarity;
            return this;
        }

        public Builder nftAge(int nftAge) {
            this.nftAge = nftAge;
            return this;
        }

        public NftDTO build() {
            return new NftDTO(this);
        }
    }
}
