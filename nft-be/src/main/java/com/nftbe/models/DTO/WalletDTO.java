package com.nftbe.models.DTO;

import lombok.Data;

@Data
public class WalletDTO {
    private int id;
    private String walletAddress;
    private double walletToken;

    private WalletDTO(Builder builder) {
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

        public WalletDTO build() {
            return new WalletDTO(this);
        }
    }
}
