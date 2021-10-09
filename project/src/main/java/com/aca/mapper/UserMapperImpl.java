package com.aca.mapper;

import com.aca.entity.User;

public class UserMapperImpl implements UserMapper {

    @Override
    public UserDetailsModel map(User user) {

        UserDetailsModel userDetailsModel = new UserDetailsModel();
        userDetailsModel.setFirsName(user.getFirstName());
        userDetailsModel.setLastName(user.getSecondName());
        userDetailsModel.setUsername(user.getUsername());

        return userDetailsModel;
    }
}
