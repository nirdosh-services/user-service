package com.nirdosh.api;

import com.nirdosh.domain.model.user.User;
import com.nirdosh.domain.model.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping("/user/{id}")
    @ResponseBody
    public User getDevotee(@PathVariable String id) {
        return userRepo.findOne(id);
    }

    @RequestMapping(name = "/user", method = RequestMethod.POST)
    public void addDevotee() {
        userRepo.save(new User());
    }

    @RequestMapping("/user")
    public List<User> getAllDevotee() {
        return userRepo.findAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public void deleteDevotee(@PathVariable String id){
        userRepo.delete(id);
    }
}
