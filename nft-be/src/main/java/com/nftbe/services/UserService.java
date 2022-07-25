package com.nftbe.services;

import com.nftbe.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IBaseService<User> {
    @Override
    public List<User> getAll() {
        return null;
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
}
