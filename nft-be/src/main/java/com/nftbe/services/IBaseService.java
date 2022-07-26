package com.nftbe.services;

import java.util.List;

public interface IBaseService<T> {
    List<T> getAll();
    T findById(int id);
    T update(T t);
    T create(T t);
    boolean delete(int id);
    List<T> getByPage(int page);
}
