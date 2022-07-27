package com.nftbe.services;

import com.nftbe.models.Wallet;
import com.nftbe.repositories.IWalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletService implements IBaseService<Wallet> {
    @Autowired
    private IWalletRepository walletRepository;
    @Override
    public List<Wallet> getAll() {
        return null;
    }

    @Override
    public Wallet findById(int id) {
        return null;
    }

    @Override
    public Wallet update(Wallet wallet) {
        return null;
    }

    @Override
    public Wallet create(Wallet wallet) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Wallet> getByPage(int page) {
        return null;
    }

    public boolean rechargeWallet(double token, String wallet) {

        return true;
    }

    public boolean transactionNft(int idNft, String newAddress, String oldAddress) {

        return true;
    }
}
