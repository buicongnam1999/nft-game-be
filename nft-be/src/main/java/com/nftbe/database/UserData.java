package com.nftbe.database;

import com.nftbe.models.User;
import com.nftbe.repositories.IUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class UserData extends BaseData {
    @Bean
    CommandLineRunner initDatabaseUser(IUserRepository userRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                if (userRepository.count() == 0) {
                    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
                    String password = bCryptPasswordEncoder.encode("nambc1234 0");
                    User user = new User.Builder()
                            .userName("nambc")
                            .userPass(password)
                            .userLastName("Bui Cong")
                            .userFirstName("Nam")
                            .userThumbnail("")
                            .userPhone("0387230643")
                            .userEmail("nambc@gmail.com")
                            .userType(1)
                            .userVerify(1)
                            .userBlock(0)
                            .walletId(19)
                            .build();

                    logger.debug(marker,
                            "Insert data: ",
                            userRepository.save(user));
                }
            }
        };
    }

}
