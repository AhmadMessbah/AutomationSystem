package com.mftplus.automationsystem;

import com.mftplus.automationsystem.users.model.Permission;
import com.mftplus.automationsystem.users.model.Role;
import com.mftplus.automationsystem.users.model.User;
import com.mftplus.automationsystem.users.service.PermissionService;
import com.mftplus.automationsystem.users.service.RoleService;
import com.mftplus.automationsystem.users.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class AutomationSystemApplication {
    private static InitService initService;
    private static RoleService roleService;
    private static UserService userService;
    private static PermissionService permissionService;

    public AutomationSystemApplication(InitService initService, RoleService roleService, UserService userService, PermissionService permissionService) {
        AutomationSystemApplication.initService = initService;
        AutomationSystemApplication.permissionService = permissionService;
        AutomationSystemApplication.userService = userService;
        AutomationSystemApplication.roleService = roleService;
    }

    public static void main(String[] args) {
        SpringApplication.run(AutomationSystemApplication.class, args);
//        initService.init();

        Permission permission1 = Permission.builder()
                .permission("Update")
                .build();


        Permission permission2 = Permission.builder()
                .permission("Delete")
                .build();
        permissionService.save(permission1);
        permissionService.save(permission2);


        Role role1 = Role.builder()
                .name("ROLE_USER")
                .permissionSet(Set.of(permission1))
                .build();


        Role role2 = Role.builder()
                .name("ROLE_ADMIN")
                .permissionSet(Set.of(permission2, permission1))
                .build();
        roleService.save(role1);
        roleService.save(role2);

        User user1 = User.builder()
                .username("aaa")
                .password("123")
                .roleSet(Set.of(role1))
                .locked(false)
                .build();

        User user2 = User.builder()
                .username("bbb")
                .password("1234")
                .roleSet(Set.of(role2))
                .locked(false)
                .build();
        userService.save(user1);
        userService.save(user2);
        System.out.println("Saved :" + user1);
        System.out.println("Saved :" + user2);
    }



}
