package com.nftbe.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "tblMarket")
public class Market {
    @Id
    @Column(name = "nft_id")
    private int nftId;
    @Column(name = "market_date")
    @NotNull
    private String marketDate;
    @Column(name = "nft_price")
    @NotNull
    private double nftPrice;
    @OneToOne()
    @JoinColumn(name = "nft_id", referencedColumnName = "nft_id", insertable = false, updatable = false)
    private Nft nft;

    public Market(Builder builder) {
        this.nftId = builder.nftId;;
        this.marketDate = builder.marketDate;;
        this.nftPrice = builder.nftPrice;
    }

    public Market() {

    }

    public int compareTo(Market market, int type) {
        if (type == 1) {
            return marketDate.compareTo(market.getMarketDate());
        } else if (type == 2) {
            return market.getMarketDate().compareTo(marketDate);
        } else if (type == 3) {
            Double obj1 = new Double(nftPrice);
            Double obj2 = new Double(market.getNftPrice());
            return obj1.compareTo(obj2);
        } else {
            Double obj1 = new Double(market.getNftPrice());
            Double obj2 = new Double(nftPrice);
            return obj1.compareTo(obj2);
        }
    }

    public static class Builder {
        private int nftId;
        private String marketDate;
        private double nftPrice;

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

        public Market build() {
            return new Market(this);
        }
    }
}
