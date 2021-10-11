package com.aca.class24.repository;

import com.aca.class24.entity.User;

public interface UserRepository {

    User save(User user);
    User getById(Long id);
}
