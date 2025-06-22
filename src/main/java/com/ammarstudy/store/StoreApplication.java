package com.ammarstudy.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        UserService userService = context.getBean(UserService.class);
        User user = new User(32319001055L,"ammar.ahmad.sameed@gmail.com","PASSWORD", "Ammar Sameed");
        userService.registerUser(user);
    }
}
