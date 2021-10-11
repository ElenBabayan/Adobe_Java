package twitterapp.com.repository;

import com.aca.class24.entity.User;

public interface UserRepository {

    User save(User user);

    User getById(Long id);

    User delete(User user);

}
