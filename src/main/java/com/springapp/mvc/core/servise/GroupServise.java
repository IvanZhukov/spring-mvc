package com.springapp.mvc.core.servise;

import com.springapp.mvc.core.model.Group;

import java.util.List;

/**
 * Created by i on 22.05.14.
 */
public interface GroupServise {

    public Group createGroup(String name, String description);

    public void updateGroup(int id, String name, String description);

    public void updateGroup(Group group);

    public void deleteGroup(Group group);

    public void deleteGroup(int id);

    public Group getGroupById(int id);

    public List<Group> getAllGroup();
}
