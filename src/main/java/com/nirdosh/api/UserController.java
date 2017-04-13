package com.nirdosh.api;

import com.nirdosh.domain.model.user.User;
import com.nirdosh.domain.model.user.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping("/user/{id}")
    @ResponseBody
    public User getUser(@PathVariable String id) {
        return userRepo.findOne(id);
    }

    @RequestMapping(name = "/user", method = RequestMethod.POST)
    public void addUser() {

    }

    @RequestMapping("/user")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String id){
        userRepo.delete(id);
    }
}
