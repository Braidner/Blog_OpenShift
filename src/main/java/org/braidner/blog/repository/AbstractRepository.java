package org.braidner.blog.repository;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.braidner.blog.entity.BaseEntity;
import org.braidner.blog.repository.filter.SearchFilter;
import org.hibernate.Filter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by Braidner on 9/8/2015.
 */
@Component
public abstract class AbstractRepository {
    @Autowired
    protected SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public <T extends BaseEntity> T findEntity(Class<T> clazz, Long id) {
        return getSession().get(clazz, id);
    }

    public<T extends SearchFilter> void setFilterParameters(T filter, Filter hibernateFilter) {
        Set<String> parameterNames = hibernateFilter.getFilterDefinition().getParameterNames();
        parameterNames.forEach(s -> hibernateFilter.setParameter(s, FieldUtils.getDeclaredField(filter.getClass(), s, true)));
    }
}
