package com.nftbe.models;

import com.nftbe.models.DTO.UserDTO;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tblUser")
@Data
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "user_name")
    @NotNull
    private String userName;
    @Column(name = "user_pass")
    @NotNull
    private String userPass;
    @Column(name = "user_lastname")
    @NotNull
    private String userLastName;
    @Column(name = "user_firstname")
    @NotNull
    private String userFirstName;
    @Column(name = "user_thumbnail")
    @NotNull
    private String userThumbnail;
    @Column(name = "user_phone")
    @NotNull
    private String userPhone;
    @Column(name = "user_email")
    @NotNull
    private String userEmail;
    @Column(name = "user_type")
    @NotNull
    private int userType;
    @Column(name = "user_verify")
    @NotNull
    private int userVerify;
    @Column(name = "user_block")
    @NotNull
    private int userBlock;
    @Column(name = "wallet_id")
    @NotNull
    private int walletId;

    public User(Builder builder) {
        this.id = builder.id;
        this.userName = builder.userName;
        this.userPass = builder.userPass;
        this.userLastName = builder.userLastName;
        this.userFirstName = builder.userFirstName;
        this.userThumbnail = builder.userThumbnail;
        this.userPhone = builder.userPhone;
        this.userEmail = builder.userEmail;
        this.userType = builder.userType;
        this.userVerify = builder.userVerify;
        this.userBlock = builder.userBlock;
        this.walletId = builder.walletId;
    }

    public User() {

    }

    public static class Builder {
        private int id;
        private String userName;
        private String userPass;
        private String userLastName;
        private String userFirstName;
        private String userThumbnail;
        private String userPhone;
        private String userEmail;
        private int userType;
        private int userVerify;
        private int userBlock;
        private int walletId;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder userPass(String userPass) {
            this.userPass = userPass;
            return this;
        }

        public Builder userLastName(String userLastName) {
            this.userLastName = userLastName;
            return this;
        }

        public Builder userFirstName(String userFirstName) {
            this.userFirstName = userFirstName;
            return this;
        }

        public Builder userThumbnail(String userThumbnail) {
            this.userThumbnail = userThumbnail;
            return this;
        }

        public Builder userPhone(String userPhone) {
            this.userPhone = userPhone;
            return this;
        }

        public Builder userEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public Builder userType(int userType) {
            this.userType = userType;
            return this;
        }

        public Builder userVerify(int userVerify) {
            this.userVerify = userVerify;
            return this;
        }

        public Builder userBlock(int userBlock) {
            this.userBlock = userBlock;
            return this;
        }

        public Builder walletId(int walletId) {
            this.walletId = walletId;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
