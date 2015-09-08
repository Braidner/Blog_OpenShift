package org.braidner.blog.repository;

import org.braidner.blog.entity.User;
import org.braidner.blog.repository.filter.UserFilter;
import org.hibernate.Filter;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

/**
 * Created by Braidner on 9/4/2015.
 */
@Repository
public class UserRepository extends AbstractRepository {

    public User findUser(UserFilter filter) {
        Filter loginFilter = getSession().enableFilter(User.FILTER_BASIC_LOGIN);
        setFilterParameters(filter, loginFilter);
        User user = (User) getSession().createQuery("from User").uniqueResult();
        System.out.println("Logged user: " + user);
        return user;
    }

    public User findUser(Long id) {
        return findEntity(User.class, id);
    }

    public User createUser(User user) {
        user.setUpdated(LocalDateTime.now());
        return saveEntity(user);
    }
}
