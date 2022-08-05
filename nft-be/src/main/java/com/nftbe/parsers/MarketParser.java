package com.nftbe.parsers;

import com.nftbe.exceptions.AppException;
import com.nftbe.models.DTO.MarketDTO;
import com.nftbe.models.Market;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;

import static com.nftbe.utils.Constants.ERROR_FORMAT;

public class MarketParser extends BaseParser<Market, MarketDTO> {
    @Override
    public Market convertJson(MarketDTO marketDTO) {
        try{
            return new Market.Builder()
                    .nftId(marketDTO.getNftId())
                    .marketDate(marketDTO.getMarketDate())
                    .nftPrice(marketDTO.getNftPrice())
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }

    @Override
    public Market convertJson(String json) {
        try{
            JSONObject marketJson = new JSONObject(json);
            return new Market.Builder()
                    .nftId(getInt(marketJson, "nftId"))
                    .marketDate(getString(marketJson, "marketDate"))
                    .nftPrice(getDouble(marketJson, "nftPrice"))
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }

    @Override
    public MarketDTO convertObject(Market market) {
        try{
            return new MarketDTO.Builder()
                    .nftId(market.getNftId())
                    .marketDate(market.getMarketDate())
                    .nftPrice(market.getNftPrice())
                    .Nft(market.getNft())
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }

}
