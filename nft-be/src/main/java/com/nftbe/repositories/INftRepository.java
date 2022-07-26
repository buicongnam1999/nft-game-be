package com.nftbe.repositories;

import com.nftbe.models.Nft;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface INftRepository extends JpaRepository<Nft, Integer> {
//    @Query(value = "SELECT e FROM Nft e")
//    List<Nft> findAllNftByPage(Pageable pageable);
}
