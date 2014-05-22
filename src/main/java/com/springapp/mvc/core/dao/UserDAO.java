package com.springapp.mvc.core.dao;

import com.springapp.mvc.core.model.User;

import java.util.List;

/**
 * Created by i on 22.05.14.
 */
public interface UserDAO extends EntityDAO<User> {
    List<User> getUsersByGroup(int groupId);
}
