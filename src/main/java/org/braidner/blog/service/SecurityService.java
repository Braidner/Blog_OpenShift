package org.braidner.blog.service;

import org.braidner.blog.entity.User;
import org.braidner.blog.filter.UserFilter;
import org.braidner.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Braidner on 9/4/2015.
 */
@Service
public class SecurityService {

    @Autowired
    private UserRepository userRepository;

    public boolean isLoggined() {
        return false;
    }

    public User login() throws Exception {
        User user = userRepository.findByLogin("braidner");

        if (user == null) {
            throw new Exception("User not found");
        }

        return user;
    }

    public User test() {
        User user = new User();
        return null;
    }
}
