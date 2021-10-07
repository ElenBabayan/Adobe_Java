package com.aca;

public interface TokenRepository {
    Token create(Token token);
    Token getById(Long id);
}
