package org.braidner.blog.repository;

import org.braidner.blog.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Braidner on 9/4/2015.
 */
@Repository
public class UserRepository {
    public User findByLogin(String login) {
        return new User();
    }
}
