package com.nftbe.services;

import com.nftbe.models.Market;
import com.nftbe.repositories.IMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService implements IBaseService<Market> {
    @Autowired
    private IMarketRepository marketRepository;

    @Override
    public List<Market> getAll() {
        return marketRepository.findAll();
    }

    @Override
    public Market findById(int id) {
        return null;
    }

    @Override
    public Market update(Market market) {
        return null;
    }

    @Override
    public Market create(Market market) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Market> getByPage(int page) {
        return null;
    }
}
