package com.nftbe.database;

import com.nftbe.models.Nft;
import com.nftbe.repositories.INftRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NftData extends BaseData {
    @Bean
    CommandLineRunner initDatabaseNft(INftRepository nftRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                if (nftRepository.count() == 0) {
                    Nft nft = new Nft.Builder()
                            .nftType(2)
                            .nftPrice(2.1)
                            .nftDateCreate("05-20-2022")
                            .nftThumbnail("")
                            .nftLife(92)
                            .nftAttack(24)
                            .nftDef(46)
                            .nftSpeed(30)
                            .walletId(19)
                            .walletOldId(19)
                            .skillId(1)
                            .build();

                    logger.debug(marker,
                            "Insert data: ",
                            nftRepository.save(nft));
                }
            }
        };
    }
}
