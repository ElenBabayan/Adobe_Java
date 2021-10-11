package com.aca.class24.service.token;

import com.aca.class24.entity.Token;
import com.aca.class24.service.user.UserCreateParams;

public interface TokenService {

        Token create(UserCreateParams userCreateParams);


}
