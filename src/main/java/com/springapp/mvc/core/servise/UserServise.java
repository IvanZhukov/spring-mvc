package com.springapp.mvc.core.servise;

import com.springapp.mvc.core.model.Group;
import com.springapp.mvc.core.model.User;

import java.util.List;

/**
 * Created by i on 22.05.14.
 */
public interface UserServise {
    public User createUser(String lastName, String firstName, Group group);

    public void updateUser(int id, String lastname, String firstName, Group group);

    public void updateUser(User user);

    public void deleteUser(User user);

    public void deleteUser(int id);

    public User getUserById(int id);

    public List<User> getUsersByGroup(int id);

    public List<User> getUsersByGroup(Group group);
}
