package com.archisacademy.main.service.controller;

import com.archisacademy.main.service.model.User;
import com.archisacademy.main.service.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/create")
    public String create(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable long id) throws Exception {
        return userService.getUserById(id);
    }

    @GetMapping("/getall/")
    public List<User> getAll(){
        return userService.getAllUsers();
    }
}
