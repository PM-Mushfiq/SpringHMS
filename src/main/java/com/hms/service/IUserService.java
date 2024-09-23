package com.hms.service;

import com.hms.model.User;

import java.util.List;

public interface IUserService {
    public User saveUser(User user);

    public List<User> fetchUserList();

    public User fetchUserById(int userId);

    void deleteUserById(int userId);
}
