package com.example.Case_Study.service;

import com.example.Case_Study.exception.UserNotFoundException;
import com.example.Case_Study.model.User;
import com.example.Case_Study.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User createUser(String username) {
        User user = new User();
        user.setUsername(username);

        return userRepository.save(user);
    }

    public Long findUserIdByUsername(String username) throws UserNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UserNotFoundException("User not found with username: " + username);
        }
        return user.getId();
    }
}