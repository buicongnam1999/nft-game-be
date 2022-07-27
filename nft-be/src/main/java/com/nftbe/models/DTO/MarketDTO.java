package com.nftbe.models.DTO;

import lombok.Data;

@Data
public class MarketDTO {
    private int id;
    private int nftId;
    private String marketDate;
    private double nftPrice;

    public MarketDTO(Builder builder) {
        this.id = builder.id;;
        this.nftId = builder.nftId;;
        this.marketDate = builder.marketDate;;
        this.nftPrice = builder.nftPrice;
    }

    public static class Builder {
        private int id;
        private int nftId;
        private String marketDate;
        private double nftPrice;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder nftId(int nftId) {
            this.nftId = nftId;
            return this;
        }

        public Builder marketDate(String marketDate) {
            this.marketDate = marketDate;
            return this;
        }

        public Builder nftPrice(double nftPrice) {
            this.nftPrice = nftPrice;
            return this;
        }

        public MarketDTO build() {
            return new MarketDTO(this);
        }
    }
}
