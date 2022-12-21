package com.nftbe.services;

import com.nftbe.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;

    public UserDetails loadUser(String username, String password) throws UsernameNotFoundException {
        if (username.equals("market")) {
            String generatedSecuredPasswordHash = BCrypt.hashpw(password, BCrypt.gensalt(12));
            return new User(username, generatedSecuredPasswordHash,
                    new ArrayList<>());
        }

        com.nftbe.models.User user = userRepository.findUserByUserName(username);
        if (!Objects.isNull(user)) {
            String generatedSecuredPasswordHash = BCrypt.hashpw(password, BCrypt.gensalt(12));
            return new User(user.getUserName(), generatedSecuredPasswordHash,
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("market".equals(username)) {
            return new User("market", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
