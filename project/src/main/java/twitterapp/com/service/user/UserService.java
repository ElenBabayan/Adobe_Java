package twitterapp.com.service.user;

import twitterapp.com.entity.Users;

public interface UserService {
    Users create(UserCreateParams userCreateParams);

}
