package com.nftbe.models;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "tblNFT")
public class Nft {
    @Id
    @Column(name = "nft_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "nft_type")
    @NotNull
    private int nftType;
    @Column(name = "nft_price")
    @NotNull
    private double nftPrice;
    @Column(name = "nft_date_create")
    @NotNull
    private String nftDateCreate;
    @Column(name = "nft_thumbnail")
    @NotNull
    private String nftThumbnail;
    @Column(name = "nft_life")
    @NotNull
    private int nftLife;
    @Column(name = "nft_attack")
    @NotNull
    private int nftAttack;
    @Column(name = "nft_def")
    @NotNull
    private int nftDef;
    @Column(name = "nft_speed")
    @NotNull
    private int nftSpeed;
    @Column(name = "nft_rarity")
    @NotNull
    private int nftRarity;
    @Column(name = "nft_age")
    @NotNull
    private int nftAge;
    @Column(name = "wallet_id")
    @NotNull
    private int walletId;
    @Column(name = "wallet_old_id")
    @NotNull
    private int walletOldId;
    @Column(name = "skill_id")
    @NotNull
    private int skillId;

    private Nft(Builder builder) {
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
    }

    public Nft() {

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

        public Nft build() {
            return new Nft(this);
        }
    }
}
