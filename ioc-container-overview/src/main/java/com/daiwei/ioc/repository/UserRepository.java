package com.daiwei.ioc.repository;

import com.daiwei.ioc.domain.User;

import java.util.Collection;

/**
 * Created by Daiwei on 2020/8/25
 */
public class UserRepository {

    private Collection<User> users;

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
