package twitterapp.com.service.user;

import org.mindrot.jbcrypt.BCrypt;
import twitterapp.com.entity.Users;
import twitterapp.com.repository.UserRepository;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users create(UserCreateParams userCreateParams) {

        final Users users = new Users();
        users.setName(userCreateParams.getName());
        users.setEmail(userCreateParams.getEmail());
        users.setDateOfBirth(userCreateParams.getDate_of_birth());
        users.setPassword(
                BCrypt.hashpw(userCreateParams.getPassword(), BCrypt.gensalt(10))
        );

        Users savedUsers = userRepository.save(users);
        return savedUsers;
    }
}
