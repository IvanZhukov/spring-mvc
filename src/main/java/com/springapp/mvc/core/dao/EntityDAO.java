package com.springapp.mvc.core.dao;

import com.springapp.mvc.core.model.Entity;

/**
 * Created by i on 22.05.14.
 */

public interface EntityDAO<T extends Entity> {

    void saveOrUpdate(T entity);

    void delete(T entity);

    T getById(int id);

    boolean isExist(int id);
}
