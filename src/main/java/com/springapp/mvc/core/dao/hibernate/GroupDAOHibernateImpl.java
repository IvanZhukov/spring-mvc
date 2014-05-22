package com.springapp.mvc.core.dao.hibernate;

import com.springapp.mvc.core.dao.GroupDAO;
import com.springapp.mvc.core.model.Group;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by i on 22.05.14.
 */
public class GroupDAOHibernateImpl extends AbstractEntityDAOHibernateImpl<Group> implements GroupDAO {

    public GroupDAOHibernateImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public List<Group> getAllGroup() {
        return getSession().getNamedQuery("getAllGrops").list();
    }
}
