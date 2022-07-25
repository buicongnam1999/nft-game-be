package com.nftbe.parsers;

import com.nftbe.exceptions.AppException;
import com.nftbe.models.Bill;
import com.nftbe.models.DTO.BillDTO;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;

import static com.nftbe.utils.Constants.ERROR_FORMAT;

public class BillParser extends BaseParser<Bill, BillDTO> {
    @Override
    public Bill convertJson(BillDTO billDTO) {
        try {
            return new Bill.Builder()
                    .id(billDTO.getId())
                    .date(billDTO.getDate())
                    .walletId(billDTO.getWalletId())
                    .walletOldId(billDTO.getWalletOldId())
                    .nftId(billDTO.getNftId())
                    .price(billDTO.getPrice())
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }

    }

    @Override
    public Bill convertJson(String json) {
        try {
            JSONObject billJson = new JSONObject(json);
            return new Bill.Builder()
                    .id(getInt(billJson, "bill_id"))
                    .date(getString(billJson, "bill_date"))
                    .walletId(getInt(billJson, "wallet_id"))
                    .walletOldId(getInt(billJson, "wallet_old_id"))
                    .nftId(getInt(billJson, "nft_id"))
                    .price(getLong(billJson, "bill_price"))
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }
}
