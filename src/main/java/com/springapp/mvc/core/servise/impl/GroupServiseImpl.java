package com.springapp.mvc.core.servise.impl;

import com.springapp.mvc.core.dao.GroupDAO;
import com.springapp.mvc.core.model.Group;
import com.springapp.mvc.core.servise.GroupServise;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by i on 22.05.14.
 */
public class GroupServiseImpl implements GroupServise {
    GroupDAO groupDAO;

    @Autowired
    public GroupServiseImpl(GroupDAO groupDAO) {
        this.groupDAO = groupDAO;
    }

    @Override
    public Group createGroup(String name, String description) {
        Group group = new Group(name, description);
        groupDAO.saveOrUpdate(group);
        return group;
    }

    @Override
    public void updateGroup(int id, String name, String description) {
        Group group = groupDAO.getById(id);
        group.setName(name);
        group.setDescription(description);
        groupDAO.saveOrUpdate(group);
    }

    @Override
    public void updateGroup(Group group) {
        groupDAO.saveOrUpdate(group);
    }

    @Override
    public void deleteGroup(Group group) {
        groupDAO.delete(group);
    }

    @Override
    public void deleteGroup(int id) {
        groupDAO.delete(groupDAO.getById(id));
    }

    @Override
    public Group getGroupById(int id) {
        return groupDAO.getById(id);
    }

    @Override
    public List<Group> getAllGroup() {
        return groupDAO.getAllGroup();
    }
}
