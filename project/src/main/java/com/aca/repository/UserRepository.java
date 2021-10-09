package com.aca.repository;

import com.aca.entity.User;

public interface UserRepository {

    User save(User user);
    User getById(Long id);
}
