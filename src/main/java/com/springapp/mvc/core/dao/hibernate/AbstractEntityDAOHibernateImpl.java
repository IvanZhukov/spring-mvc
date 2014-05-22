package com.springapp.mvc.core.dao.hibernate;

import com.springapp.mvc.core.dao.EntityDAO;
import com.springapp.mvc.core.model.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.ParameterizedType;

/**
 * Created by i on 22.05.14.
 */
@Repository    //для преобразования исключений в необрабатываемые исключения Spring
public class AbstractEntityDAOHibernateImpl<T extends Entity> implements EntityDAO<T> {
    private final Class<T> type = getType();

    /**
     * Returns parametrized type of entity using reflection
     *
     * @return type of entity
     */
    protected Class<T> getType() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    private SessionFactory sessionFactory;

    @Autowired  //автосвязывание бина
    public AbstractEntityDAOHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveOrUpdate(T entity) {
        getSession().saveOrUpdate(entity);

    }

    @Override
    public void delete(T entity) {
        getSession().delete(entity);

    }

    @Override
    public T getById(int id) {
        return (T) getSession().get(getType(), id);
    }

    @Override
    public boolean isExist(int id) {
        return getById(id) != null;
    }

    /**
     * Конструирует DAO
     * @return текущий сеанс из фабрики
     */
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
