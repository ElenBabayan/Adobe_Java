package com.aca.repository;

import com.aca.entity.Token;

public interface TokenRepository {
    Token create(Token token);
    Token getById(Long id);
}
