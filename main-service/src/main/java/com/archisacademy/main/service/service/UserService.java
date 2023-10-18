package com.archisacademy.main.service.service;

import com.archisacademy.main.service.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    String createUser(User user);

    String updateUser(User user);

    List<User> getAllUsers();

    User getUserById(long id) throws Exception;

    String delete(long id);


}
