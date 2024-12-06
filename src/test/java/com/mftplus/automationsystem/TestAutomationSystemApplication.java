package com.mftplus.automationsystem;

import org.springframework.boot.SpringApplication;

public class TestAutomationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.from(AutomationSystemApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
