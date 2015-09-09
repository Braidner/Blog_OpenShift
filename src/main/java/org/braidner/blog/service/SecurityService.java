package org.braidner.blog.service;

import org.braidner.blog.entity.User;
import org.braidner.blog.entity.enums.OAuthProvider;
import org.braidner.blog.repository.UserRepository;
import org.braidner.blog.repository.filter.UserFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Braidner on 9/4/2015.
 */
@Service
public class SecurityService {

    @Autowired
    private UserRepository userRepository;

    public boolean isLogined() {
        return false;
    }

    public User login(String login, String password, OAuthProvider provider, String oauthId) throws Exception {
        UserFilter userFilter = new UserFilter(login, password, provider, oauthId);
        User user = userRepository.findUser(userFilter);

        if (user == null) {
            throw new Exception("User not found");
        }

        return user;
    }

    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    public User test() {
        User user = new User();
        return user;
    }
}
