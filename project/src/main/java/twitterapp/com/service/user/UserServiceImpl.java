package twitterapp.com.service.user;

import org.mindrot.jbcrypt.BCrypt;
import twitterapp.com.entity.User;
import twitterapp.com.repository.UserRepository;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(UserCreateParams userCreateParams) {

        final User user = new User();
        user.setName(userCreateParams.getName());
        user.setEmail(userCreateParams.getEmail());
        user.setDate_of_birth(userCreateParams.getDate_of_birth());
        user.setPassword(
                BCrypt.hashpw(userCreateParams.getPassword(), BCrypt.gensalt(10))
        );

        User savedUser = userRepository.save(user);
        return savedUser;
    }
}
