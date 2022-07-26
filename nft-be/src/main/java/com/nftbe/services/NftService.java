package com.nftbe.services;

import com.nftbe.models.Nft;
import com.nftbe.repositories.INftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NftService implements IBaseService<Nft> {
    @Autowired
    private INftRepository nftRepository;
    @Override
    public List<Nft> getAll() {
        return nftRepository.findAll();
    }

    @Override
    public Nft findById(int id) {
        return null;
    }

    @Override
    public Nft update(Nft nft) {
        return null;
    }

    @Override
    public Nft create(Nft nft) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
