package com.nftbe.parsers;

import com.nftbe.exceptions.AppException;
import com.nftbe.models.DTO.UserDTO;
import com.nftbe.models.User;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;

import static com.nftbe.utils.Constants.ERROR_FORMAT;

public class UserParser extends BaseParser<User, UserDTO> {
    @Override
    public User convertJson(UserDTO userDTO) {
        try {
            return new User.Builder()
                    .id(userDTO.getId())
                    .userName(userDTO.getUserName())
                    .userPass(userDTO.getUserPass())
                    .userLastName(userDTO.getUserLastName())
                    .userFirstName(userDTO.getUserFirstName())
                    .userThumbnail(userDTO.getUserThumbnail())
                    .userPhone(userDTO.getUserPhone())
                    .userEmail(userDTO.getUserEmail())
                    .userType(userDTO.getUserType())
                    .userVerify(userDTO.getUserVerify())
                    .userBlock(userDTO.getUserBlock())
                    .walletId(userDTO.getWalletId())
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }

    @Override
    public User convertJson(String json) {
        try {
            JSONObject userJson = new JSONObject(json);
            return new User.Builder()
                    .id(getInt(userJson, "user_id"))
                    .userName(getString(userJson, "user_name"))
                    .userPass(getString(userJson, "user_pass"))
                    .userLastName(getString(userJson, "user_lastname"))
                    .userFirstName(getString(userJson, "user_firstname"))
                    .userThumbnail(getString(userJson, "user_thumbnail"))
                    .userPhone(getString(userJson, "user_phone"))
                    .userEmail(getString(userJson, "user_email"))
                    .userType(getInt(userJson, "user_type"))
                    .userVerify(getInt(userJson, "user_verify"))
                    .userBlock(getInt(userJson, "user_block"))
                    .walletId(getInt(userJson, "wallet_id"))
                    .build();
        } catch (Exception exception) {
            throw new AppException(HttpStatus.INTERNAL_SERVER_ERROR, ERROR_FORMAT);
        }
    }
}
