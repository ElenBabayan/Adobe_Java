package com.aca;

public interface UserRepository {

    User create(User user);
    User getById(Long id);
}
