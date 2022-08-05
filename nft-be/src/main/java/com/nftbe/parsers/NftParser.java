package com.nftbe.parsers;

import com.nftbe.exceptions.AppException;
import com.nftbe.models.DTO.NftDTO;
import com.nftbe.models.Nft;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;

import static com.nftbe.utils.Constants.ERROR_FORMAT;

public class NftParser extends BaseParser<Nft, NftDTO> {
    @Override
    public Nft convertJson(NftDTO nftDTO) {
        try {
            return new Nft.Builder()
                    .id(nftDTO.getId())
                    .nftType(nftDTO.getNftType())
                    .nftPrice(nftDTO.getNftPrice())
                    .nftDateCreate(nftDTO.getNftDateCreate())
                    .nftThumbnail(nftDTO.getNftThumbnail())
                    .nftLife(nftDTO.getNftLife())
                    .nftAttack(nftDTO.getNftAttack())
                    .nftDef(nftDTO.getNftDef())
                    .nftSpeed(nftDTO.getNftSpeed())
                    .walletId(nftDTO.getWalletId())
                    .walletOldId(nftDTO.getWalletOldId())
                    .skillId(nftDTO.getSkillId())
                    .nftRarity(nftDTO.getNftRarity())
                    .nftAge(nftDTO.getNftAge())
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }

    @Override
    public Nft convertJson(String json) {
        try {
            JSONObject nftJson = new JSONObject(json);
            return new Nft.Builder()
                    .id(getInt(nftJson, "nft_id"))
                    .nftType(getInt(nftJson, "nft_type"))
                    .nftPrice(getLong(nftJson, "nft_price"))
                    .nftDateCreate(getString(nftJson, "nft_date_create"))
                    .nftThumbnail(getString(nftJson, "nft_thumbnail"))
                    .nftLife(getInt(nftJson, "nft_life"))
                    .nftAttack(getInt(nftJson, "nft_attack"))
                    .nftDef(getInt(nftJson, "nft_def"))
                    .nftSpeed(getInt(nftJson, "nft_speed"))
                    .walletId(getInt(nftJson, "wallet_id"))
                    .walletOldId(getInt(nftJson, "wallet_old_id"))
                    .skillId(getInt(nftJson, "skill_id"))
                    .nftRarity(getInt(nftJson, "nft_rarity"))
                    .nftAge(getInt(nftJson, "nft_age"))
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }

    @Override
    public NftDTO convertObject(Nft nft) {
        try {
            return new NftDTO.Builder()
                    .id(nft.getId())
                    .nftType(nft.getNftType())
                    .nftPrice(nft.getNftPrice())
                    .nftDateCreate(nft.getNftDateCreate())
                    .nftThumbnail(nft.getNftThumbnail())
                    .nftLife(nft.getNftLife())
                    .nftAttack(nft.getNftAttack())
                    .nftDef(nft.getNftDef())
                    .nftSpeed(nft.getNftSpeed())
                    .walletId(nft.getWalletId())
                    .walletOldId(nft.getWalletOldId())
                    .skillId(nft.getSkillId())
                    .nftRarity(nft.getNftRarity())
                    .nftAge(nft.getNftAge())
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }


}
