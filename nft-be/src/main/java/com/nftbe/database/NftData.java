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
                if (nftRepository.count() < 10) {
//                    Nft nft1 = new Nft.Builder()
//                            .nftType(2)
//                            .nftPrice(2.1)
//                            .nftDateCreate("07-21-2022")
//                            .nftThumbnail("Hand.png")
//                            .nftLife(81)
//                            .nftAttack(64)
//                            .nftDef(34)
//                            .nftSpeed(15)
//                            .walletId(19)
//                            .walletOldId(19)
//                            .skillId(1)
//                            .build();
//
//                    Nft nft2 = new Nft.Builder()
//                            .nftType(1)
//                            .nftPrice(3.1)
//                            .nftDateCreate("05-12-2021")
//                            .nftThumbnail("Hero.png")
//                            .nftLife(92)
//                            .nftAttack(24)
//                            .nftDef(46)
//                            .nftSpeed(30)
//                            .walletId(19)
//                            .walletOldId(19)
//                            .skillId(1)
//                            .build();
//
//                    Nft nft3 = new Nft.Builder()
//                            .nftType(1)
//                            .nftPrice(0.1)
//                            .nftDateCreate("11-12-2021")
//                            .nftThumbnail("Hero.png")
//                            .nftLife(130)
//                            .nftAttack(89)
//                            .nftDef(22)
//                            .nftSpeed(35)
//                            .walletId(19)
//                            .walletOldId(19)
//                            .skillId(1)
//                            .build();
//
//                    Nft nft4 = new Nft.Builder()
//                            .nftType(1)
//                            .nftPrice(3.1)
//                            .nftDateCreate("05-12-2021")
//                            .nftThumbnail("Hero.png")
//                            .nftLife(92)
//                            .nftAttack(24)
//                            .nftDef(46)
//                            .nftSpeed(30)
//                            .walletId(19)
//                            .walletOldId(19)
//                            .skillId(1)
//                            .build();
//
//                    Nft nft5 = new Nft.Builder()
//                            .nftType(1)
//                            .nftPrice(3.1)
//                            .nftDateCreate("05-12-2021")
//                            .nftThumbnail("Hero.png")
//                            .nftLife(92)
//                            .nftAttack(24)
//                            .nftDef(46)
//                            .nftSpeed(30)
//                            .walletId(19)
//                            .walletOldId(19)
//                            .skillId(1)
//                            .build();
//
//                    Nft nft6 = new Nft.Builder()
//                            .nftType(3)
//                            .nftPrice(9.2)
//                            .nftDateCreate("05-12-2021")
//                            .nftThumbnail("Leg.png")
//                            .nftLife(100)
//                            .nftAttack(67)
//                            .nftDef(80)
//                            .nftSpeed(45)
//                            .walletId(19)
//                            .walletOldId(19)
//                            .skillId(1)
//                            .build();
//
//                    Nft nft7 = new Nft.Builder()
//                            .nftType(3)
//                            .nftPrice(5.6)
//                            .nftDateCreate("05-12-2021")
//                            .nftThumbnail("Leg.png")
//                            .nftLife(105)
//                            .nftAttack(100)
//                            .nftDef(103)
//                            .nftSpeed(85)
//                            .walletId(19)
//                            .walletOldId(19)
//                            .skillId(1)
//                            .build();
//
//                    Nft nft8 = new Nft.Builder()
//                            .nftType(2)
//                            .nftPrice(2.8)
//                            .nftDateCreate("05-12-2021")
//                            .nftThumbnail("Hand.png")
//                            .nftLife(105)
//                            .nftAttack(100)
//                            .nftDef(103)
//                            .nftSpeed(85)
//                            .walletId(19)
//                            .walletOldId(19)
//                            .skillId(1)
//                            .build();
//
//                    Nft nft9 = new Nft.Builder()
//                            .nftType(2)
//                            .nftPrice(2.9)
//                            .nftDateCreate("05-12-2021")
//                            .nftThumbnail("Hand.png")
//                            .nftLife(105)
//                            .nftAttack(100)
//                            .nftDef(103)
//                            .nftSpeed(85)
//                            .walletId(19)
//                            .walletOldId(19)
//                            .skillId(1)
//                            .build();
//
//                    nftRepository.save(nft1);
//                    nftRepository.save(nft2);
//                    nftRepository.save(nft3);
//                    nftRepository.save(nft4);
//                    nftRepository.save(nft5);
//                    nftRepository.save(nft6);
//                    nftRepository.save(nft7);
//                    nftRepository.save(nft8);
//                    nftRepository.save(nft9);

//                    logger.debug(marker,
//                            "Insert data: ",
//                            nftRepository.save(nft1));
                }
//                nftRepository.deleteAll();
            }
        };
    }
}
