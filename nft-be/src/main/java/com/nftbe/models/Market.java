package com.nftbe.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "tblMarket")
public class Market {
    @Id
    @Column(name = "market_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "nft_id")
    @NotNull
    private int nftId;
    @Column(name = "market_date")
    @NotNull
    private String marketDate;
    @Column(name = "nft_price")
    @NotNull
    private double nftPrice;
    @ManyToOne()
    @JoinColumn(name = "nft_id", referencedColumnName = "nft_id", insertable = false, updatable = false)
    private Nft nft;

    public Market(Builder builder) {
        this.id = builder.id;;
        this.nftId = builder.nftId;;
        this.marketDate = builder.marketDate;;
        this.nftPrice = builder.nftPrice;
    }

    public Market() {

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

        public Market build() {
            return new Market(this);
        }
    }
}
