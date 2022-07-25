package com.nftbe.models;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tblWallet")
@Data
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "wallet_id")
    private int id;
    @Column(name = "wallet_address")
    private String walletAddress;
    @Column(name = "wallet_token")
    private double walletToken;

    public Wallet() {

    }

    public Wallet(Builder builder) {
        this.id = builder.id;
        this.walletAddress = builder.walletAddress;;
        this.walletToken = builder.walletToken;;
    }

    public static class Builder {
        private int id;
        private String walletAddress;
        private double walletToken;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder walletAddress(String walletAddress) {
            this.walletAddress = walletAddress;
            return this;
        }

        public Builder walletToken(double walletToken) {
            this.walletToken = walletToken;
            return this;
        }

        public Wallet build() {
            return new Wallet(this);
        }
    }
}
