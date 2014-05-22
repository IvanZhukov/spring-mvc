package com.springapp.mvc.core.model;

/**
 * Created by i on 22.05.14.
 */
public class User extends Entity {
    private String lastName;
    private String firstName;
    private Group group;

    public User() {
    }

    public User(String lastName, String firstName, Group group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
