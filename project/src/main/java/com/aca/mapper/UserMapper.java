package com.aca.mapper;

import com.aca.entity.User;

public interface UserMapper {
    UserDetailsModel map(User user);
}
