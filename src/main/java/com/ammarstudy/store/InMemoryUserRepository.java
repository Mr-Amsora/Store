package com.ammarstudy.store;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InMemoryUserRepository implements UserRepository {
    HashMap<String, User> users = new HashMap<>();
    @Override
    public void save(User user) {
        if (users.containsKey(user.getEmail())) {
            System.out.println("User with email " + user.getEmail() + " already exists. Updating existing user.");
        }
        users.put(user.getEmail(), user);
        //generate a unique ID for the user
    }
}
