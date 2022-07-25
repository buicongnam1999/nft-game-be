package com.nftbe.repositories;

import com.nftbe.models.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWalletRepository extends JpaRepository<Wallet, Integer> {
}
