package com.hms.controller;

import com.hms.model.User;
import com.hms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired //(required=true)
    private IUserService userService;

    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PutMapping("/users/{id}")
    public User editUser(@PathVariable("id") int userId, @RequestBody User user){
        return userService.updateUser(userId, user);
    }

//    @PatchMapping("/users")
//    public User changePass(@RequestBody User user){
//        return userService.saveUser(user);
//    }

    @GetMapping("/users")
    public List<User> fetchUserList(){
        return userService.fetchUserList();
    }

    @GetMapping("/users/{id}")
    public User fetchUserById(@PathVariable("id") int userId){
        return userService.fetchUserById(userId);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable("id") int userId){
        userService.deleteUserById(userId);
        return "User Deleted Successfully";
    }
}
