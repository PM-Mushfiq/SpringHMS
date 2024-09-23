package com.hms.service;

import com.hms.model.User;
import com.hms.repository.UserJPARepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceJPAImpl implements IUserService {

    @Autowired
    private UserJPARepo userJPARepo;

    @Override
    public User saveUser(User user) {
        return userJPARepo.save(user);
    }

    @Override
    public List<User> fetchUserList() {
        return userJPARepo.findAll();
    }

    @Override
    public User fetchUserById(int userId) {
        return userJPARepo.findById(userId).get();
    }

    @Override
    public void deleteUserById(int userId) {
        userJPARepo.deleteById(userId);
    }

    @Override
    public User updateUser(int userId, User user) {
        User editableUser = userJPARepo.findById(userId).get();

        if(Objects.nonNull(user.getFullName()) &&
                !"".equalsIgnoreCase(user.getFullName())) {
            editableUser.setFullName(user.getFullName());
        }

        if(Objects.nonNull(user.getPhone()) &&
                !"".equalsIgnoreCase(user.getPhone())) {
            editableUser.setPhone(user.getPhone());
        }

        return userJPARepo.save(editableUser);
    }

}
