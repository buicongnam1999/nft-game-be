package com.nftbe.repositories;

import com.nftbe.models.Nft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INftRepository extends JpaRepository<Nft, Integer> {
}
