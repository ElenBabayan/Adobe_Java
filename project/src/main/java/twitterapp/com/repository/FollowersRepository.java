package twitterapp.com.repository;

import com.aca.class24.entity.User;

public interface FollowersRepository {

    User save(User user);
    User getById(Long id);
}
