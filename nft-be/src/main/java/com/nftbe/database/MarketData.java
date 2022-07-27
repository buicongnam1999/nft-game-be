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
                if (marketRepository.count() == 0) {
                    Market market = new Market.Builder()
                            .nftId(22)
                            .marketDate("05-02-2022")
                            .nftPrice(0.18)
                            .build();
                    logger.debug(marker,
                            "Insert data: ",
                            marketRepository.save(market)
                    );
                }
            }
        };
    }
}
