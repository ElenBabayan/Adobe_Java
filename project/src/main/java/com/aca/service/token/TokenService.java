package com.aca.service.token;

import com.aca.entity.Token;
import com.aca.entity.User;
import com.aca.service.user.UserCreateParams;

public interface TokenService {

        Token create(UserCreateParams userCreateParams);


}
