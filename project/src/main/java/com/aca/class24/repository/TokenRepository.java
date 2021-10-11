package com.aca.class24.repository;

import com.aca.class24.entity.Token;

public interface TokenRepository {
    Token create(Token token);
    Token getById(Long id);
}
