package com.aca.service.user;

import com.aca.entity.User;
import com.aca.repository.UserRepository;
import org.mindrot.jbcrypt.BCrypt;

import java.time.LocalDateTime;

/*
UserService

UserRepository

Hibernate
 */
public class UserServiceImpl implements UserService {

    private static final String SALT = BCrypt.gensalt(10); // ~ hash anelu jamanaky 2x, inchqan mec etqan secure
    // inject arecinq userrepo interface
    private UserRepository userRepository;

    // Userrepoi tarber impl ov karanq sarqenq instancey
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //kara yntacqum poxancvi, bayc senc chenq grum vor constructorov ani anpayman
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(final UserCreateParams userCreateParams) {
        // dependency injection
        final User user = new User();
        user.setUsername(userCreateParams.getUsername());
        user.setFirstName(userCreateParams.getFirstName());
        user.setSecondName(userCreateParams.getLastName());
        user.setPassword(
                BCrypt.hashpw(userCreateParams.getPassword(), SALT) // salti mijocov encrypt a anum
        );
        user.setCreatedAt(LocalDateTime.now());

        User savedUser = userRepository.save(user);
        return savedUser;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String password = BCrypt.hashpw(
                "password",
                BCrypt.gensalt(10)
        );
        System.out.println(System.currentTimeMillis() - start);
    }
}
