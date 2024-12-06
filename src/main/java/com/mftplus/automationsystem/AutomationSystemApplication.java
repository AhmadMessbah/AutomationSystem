package com.mftplus.automationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutomationSystemApplication {
    private static InitService initService;

    public AutomationSystemApplication(InitService initService) {
        AutomationSystemApplication.initService = initService;
    }

    public static void main(String[] args) {
        SpringApplication.run(AutomationSystemApplication.class, args);
        initService.init();
    }

}
