package com.ammarstudy.store;

import com.ammarstudy.store.entities.Address;
import com.ammarstudy.store.entities.Profile;
import com.ammarstudy.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        //ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user =User.builder().id(1L)
                 .name("Ammar")
                 .email("ammar@gmail.com")
                 .password("123456")
                 .build();
        var address = Address.builder()
                .id(1L)
                .street("123 Main St")
                .city("Anytown")
                .state("CA")
                .zip("12345")
                .build();
        user.addAddress(address);
        var profile = Profile.builder().id(1L).bio("bio").build();
        user.setProfile(profile);
        profile.setUser(user);
        System.out.println(user);
    }
}
