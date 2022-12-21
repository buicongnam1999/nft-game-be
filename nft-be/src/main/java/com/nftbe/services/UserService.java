package com.nftbe.services;

import com.nftbe.models.DTO.UserDTO;
import com.nftbe.models.User;
import com.nftbe.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
import java.util.Objects;

import static com.nftbe.utils.Constants.EMPTY;

@Service
public class UserService implements IBaseService<User>{
    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<User> getByPage(int page) {
        return null;
    }

    public String login(UserDTO userDTO) {
        String token = EMPTY;
        User user = userRepository.findUserByUserName(userDTO.getUserName());
        if (!Objects.isNull(user)) {
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            if (bCryptPasswordEncoder.matches(userDTO.getUserPass(), user.getUserPass())) {
                return token;
            }
            return null;
        }

        return null;
    }

    public User getUserLogin(String username, String password) {
        User user = userRepository.findUserByUserName(username);
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        if (!Objects.isNull(user) && bCryptPasswordEncoder.matches(password, user.getUserPass())) {
            return user;
        }
        return null;
    }
}
