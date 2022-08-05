package com.nftbe.parsers;

import com.nftbe.exceptions.AppException;
import com.nftbe.models.DTO.WalletDTO;
import com.nftbe.models.Wallet;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;

import static com.nftbe.utils.Constants.ERROR_FORMAT;

public class WalletParser extends BaseParser<Wallet, WalletDTO> {
    @Override
    public Wallet convertJson(WalletDTO walletDTO) {
        try {
            return new Wallet.Builder()
                    .id(walletDTO.getId())
                    .walletAddress(walletDTO.getWalletAddress())
                    .walletToken(walletDTO.getWalletToken())
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }

    @Override
    public Wallet convertJson(String json) {
        try {
            JSONObject walletJson = new JSONObject(json);
            return new Wallet.Builder()
                    .id(getInt(walletJson, "wallet_id"))
                    .walletAddress(getString(walletJson, "wallet_address"))
                    .walletToken(getLong(walletJson, "wallet_token"))
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }

    @Override
    public WalletDTO convertObject(Wallet wallet) {
        try {
            return new WalletDTO.Builder()
                    .id(wallet.getId())
                    .walletAddress(wallet.getWalletAddress())
                    .walletToken(wallet.getWalletToken())
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }

}
