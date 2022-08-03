package com.nftbe.repositories;

import com.nftbe.models.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMarketRepository extends JpaRepository<Market, Integer> {

}
