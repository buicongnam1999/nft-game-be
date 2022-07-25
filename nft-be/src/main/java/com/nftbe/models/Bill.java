package com.nftbe.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tblBill")
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bill_id")
    private int id;
    @Column(name = "bill_date")
    private String date;
    @Column(name = "wallet_id")
    private int walletId;
    @Column(name = "wallet_old_id")
    private int walletOldId;
    @Column(name = "nft_id")
    private int nftId;
    @Column(name = "bill_price")
    private long price;

    private Bill(Builder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.walletId = builder.walletId;
        this.walletOldId = builder.walletOldId;
        this.nftId = builder.nftId;
        this.price = builder.price;
    }

    public Bill() {

    }

    public static class Builder {
        private int id;
        private String date;
        private int walletId;
        private int walletOldId;
        private int nftId;
        private long price;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
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

        public Builder nftId(int nftId) {
            this.nftId = nftId;
            return this;
        }

        public Builder price(long price) {
            this.price = price;
            return this;
        }

        public Bill build() {
            return new Bill(this);
        }
    }
}
