package com.nftbe.services;

import com.nftbe.models.DTO.MarketDTO;
import com.nftbe.models.Market;
import com.nftbe.repositories.IMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.*;

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
        if (id > 0) {
            Optional<Market> market = marketRepository.findById(id);
            return market.orElse(null);
        }
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
        int pageSize = 8;
        Pageable pageable = PageRequest.of(page, pageSize);
        return marketRepository.findAll(pageable).getContent();
    }

    public long getCountSale() {
        return marketRepository.count();
    }

    public List<Market> findByArray(String json) {

        return null;
    }

    public List<Market> sortPrice(int type) {
        List<Market> markets = getAll();
        if (type > 0) {
            Collections.sort(markets, (o1, o2) -> o1.getMarketDate().compareTo(o2.getMarketDate()));
            return markets;
        }

        return null;
    }
}
