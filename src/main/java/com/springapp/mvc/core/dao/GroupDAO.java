package com.springapp.mvc.core.dao;

import com.springapp.mvc.core.model.Group;

import java.util.List;

/**
 * Created by i on 22.05.14.
 */
public interface GroupDAO extends EntityDAO<Group> {
    List<Group> getAllGroup();

}
