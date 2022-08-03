package com.nftbe.database;

import com.nftbe.models.Market;
import com.nftbe.repositories.IMarketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MarketData extends BaseData {
    @Bean
    CommandLineRunner initMarketData(IMarketRepository marketRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                if (marketRepository.count() < 10) {
                    Market market = new Market.Builder()
                            .nftId(7)
                            .marketDate("05-02-2022")
                            .nftPrice(2.1)
                            .build();
                    Market market1 = new Market.Builder()
                            .nftId(19)
                            .marketDate("05-02-2022")
                            .nftPrice(2.1)
                            .build();
//                    Market market2 = new Market.Builder()
//                            .nftId(6)
//                            .marketDate("05-02-2022")
//                            .nftPrice(0.1)
//                            .build();
//                    Market market3 = new Market.Builder()
//                            .nftId(12)
//                            .marketDate("05-02-2022")
//                            .nftPrice(0.5)
//                            .build();
//                    Market market4 = new Market.Builder()
//                            .nftId(13)
//                            .marketDate("05-02-2022")
//                            .nftPrice(0.7)
//                            .build();
//                    Market market5 = new Market.Builder()
//                            .nftId(16)
//                            .marketDate("05-02-2022")
//                            .nftPrice(0.14)
//                            .build();
//                    Market market6 = new Market.Builder()
//                            .nftId(18)
//                            .marketDate("05-02-2022")
//                            .nftPrice(0.4)
//                            .build();
//                    logger.debug(marker,
//                            "Insert data: ",
//                            marketRepository.save(market)
//                    );
                    marketRepository.save(market1);
                    marketRepository.save(market);
//                    marketRepository.save(market3);
//                    marketRepository.save(market4);
//                    marketRepository.save(market5);
//                    marketRepository.save(market6);
                }
//                marketRepository.deleteAll();
            }
        };
    }
}
