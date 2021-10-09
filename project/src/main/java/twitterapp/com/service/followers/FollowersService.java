package twitterapp.com.service.followers;

import twitterapp.com.entity.Followers;

public interface FollowersService {
    Followers create(FollowersCreateParams userCreateParams);

}
