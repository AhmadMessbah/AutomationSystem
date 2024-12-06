package com.mftplus.automationsystem;

import com.mftplus.automationsystem.users.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class InitService {
    private final UserService userService;

    public InitService(UserService userService) {
        this.userService = userService;
    }

    public void init(){
        System.out.println("TEST");
        System.out.println(userService.findAll());
    }
}
