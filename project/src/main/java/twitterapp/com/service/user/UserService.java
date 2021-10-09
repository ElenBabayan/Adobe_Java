package twitterapp.com.service.user;

import twitterapp.com.entity.User;

public interface UserService {
    User create(UserCreateParams userCreateParams);

}
