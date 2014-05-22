package com.springapp.mvc.core.dao.hibernate;

import com.springapp.mvc.core.dao.UserDAO;
import com.springapp.mvc.core.model.User;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by i on 22.05.14.
 */
public class UserDAOHibernateImpl extends AbstractEntityDAOHibernateImpl<User> implements UserDAO{

    public UserDAOHibernateImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public List<User> getUsersByGroup(int groupId) {
        return getSession()
                .getNamedQuery("getUsersByGroup")
                .setInteger("groupId", groupId)
                .list();
    }
}
