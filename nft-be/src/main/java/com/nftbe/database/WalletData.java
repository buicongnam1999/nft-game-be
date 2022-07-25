package com.nftbe.database;

import com.nftbe.models.Wallet;
import com.nftbe.repositories.IWalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WalletData extends BaseData {
    @Bean
    CommandLineRunner initDatabaseWallet(IWalletRepository walletRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                if (walletRepository.count() == 0) {
                    Wallet wallet = new Wallet.Builder()
                            .walletAddress("0xb6053f546E578716c13211af04672e116Dc07F8a")
                            .walletToken(100.5)
                            .build();
                    logger.debug(marker,
                            "Insert data: ",
                            walletRepository.save(wallet));
                }
            }
        };
    }
}
