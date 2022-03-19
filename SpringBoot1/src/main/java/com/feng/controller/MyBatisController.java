package com.feng.controller;

import com.feng.mapper.UserMapper;
import com.feng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyBatisController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        List<User> allUsers = userMapper.getAllUsers();
        return allUsers;
    }
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") int id){
        User user = userMapper.getUser(id);
        return user;
    }
    @GetMapping("/addUser/{id}/{name}/{age}")
    public void addUser(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("age") int age){
        User user = new User(id, name, age);
        userMapper.addUser(user);
    }
    @GetMapping("/updateUser/{id}/{name}/{age}")
    public void updateUser(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("age") int age){
        User user = new User(id, name, age);
        userMapper.updateUser(user);
    }
    @GetMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userMapper.deleteUser(id);
    }
}
