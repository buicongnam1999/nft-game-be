package com.nftbe.models.DTO;

import com.nftbe.models.Nft;
import lombok.Data;

@Data
public class MarketDTO {
    private int id;
    private int nftId;
    private String marketDate;
    private double nftPrice;
    private Nft nft;

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
        private Nft nft;

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

        public Builder Nft(Nft nft) {
            this.nft = nft;
            return this;
        }

        public MarketDTO build() {
            return new MarketDTO(this);
        }
    }
}
