package com.archisacademy.main.service.service.imp;

import com.archisacademy.main.service.model.User;
import com.archisacademy.main.service.repository.UserRepository;
import com.archisacademy.main.service.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    public UserServiceImp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public String createUser(User user) {
        User userForDataBase = new User();
        userForDataBase.setName(user.getName());
        userForDataBase.setEmail(user.getEmail());
        userForDataBase.setLastName(user.getLastName());
        userForDataBase.setPassword(user.getPassword());
        userRepository.save(userForDataBase);
        return "User successfully created";
    }

    @Override
    public String updateUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) throws Exception {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()){
            throw new Exception("User not found with this id" + id);
        }
        return user.get();
    }

    @Override
    public String delete(long id) {
        return null;
    }
}
