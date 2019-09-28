package com.nu34life.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T> {
	List<T> listAll();
    Optional<T> getById(Long id);
    T create(T object);
    T update(T object);
    void delete(Long id);
}
