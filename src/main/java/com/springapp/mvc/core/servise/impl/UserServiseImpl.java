package com.springapp.mvc.core.servise.impl;

import com.springapp.mvc.core.dao.UserDAO;
import com.springapp.mvc.core.model.Group;
import com.springapp.mvc.core.model.User;
import com.springapp.mvc.core.servise.UserServise;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by i on 22.05.14.
 */
public class UserServiseImpl implements UserServise {


    UserDAO userDAO;

    @Autowired
    public UserServiseImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User createUser(String lastName, String firstName, Group group) {
        User user = new User(lastName, firstName, group);
        userDAO.saveOrUpdate(user);
        return user;
    }

    @Override
    public void updateUser(int id, String lastname, String firstName, Group group) {
        User user = userDAO.getById(id);
        user.setLastName(lastname);
        user.setLastName(firstName);
        user.setGroup(group);
        userDAO.saveOrUpdate(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.saveOrUpdate(user);
    }

    @Override
    public void deleteUser(User user) {
        userDAO.delete(user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.delete(userDAO.getById(id));
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getById(id);
    }

    @Override
    public List<User> getUsersByGroup(int id) {
        return userDAO.getUsersByGroup(id);
    }

    @Override
    public List<User> getUsersByGroup(Group group) {
        return userDAO.getUsersByGroup(group.getId());
    }
}
