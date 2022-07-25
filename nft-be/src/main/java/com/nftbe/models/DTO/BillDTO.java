package com.nftbe.models.DTO;

import lombok.Data;

@Data
public class BillDTO {
    private int id;
    private String date;
    private int walletId;
    private int walletOldId;
    private int nftId;
    private long price;

    private BillDTO(Builder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.walletId = builder.walletId;
        this.walletOldId = builder.walletOldId;
        this.nftId = builder.nftId;
        this.price = builder.price;
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

        public BillDTO build() {
            return new BillDTO(this);
        }
    }
}
