package com.mftplus.automationsystem;

import com.mftplus.automationsystem.inventory.model.Product;
import com.mftplus.automationsystem.inventory.model.ProductGroup;
import com.mftplus.automationsystem.inventory.model.Property;
import com.mftplus.automationsystem.inventory.model.Storage;
import com.mftplus.automationsystem.inventory.model.enums.InventoryStatus;
import com.mftplus.automationsystem.inventory.service.ProductGroupService;
import com.mftplus.automationsystem.inventory.service.ProductService;
import com.mftplus.automationsystem.inventory.service.PropertyService;
import com.mftplus.automationsystem.inventory.service.StorageService;
import com.mftplus.automationsystem.users.model.Permission;
import com.mftplus.automationsystem.users.model.Role;
import com.mftplus.automationsystem.users.model.User;
import com.mftplus.automationsystem.users.service.PermissionService;
import com.mftplus.automationsystem.users.service.RoleService;
import com.mftplus.automationsystem.users.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class AutomationSystemApplication {
    private static InitService initService;
    private static RoleService roleService;
    private static UserService userService;
    private static PermissionService permissionService;
    private static ProductService productService;
    private static ProductGroupService productGroupService;
    private static PropertyService propertyService;
    private static StorageService storageService;

    public AutomationSystemApplication(InitService initService, RoleService roleService, UserService userService, PermissionService permissionService, ProductService productService, ProductGroupService productGroupService, PropertyService propertyService, StorageService storageService) {
        AutomationSystemApplication.initService = initService;
        AutomationSystemApplication.permissionService = permissionService;
        AutomationSystemApplication.userService = userService;
        AutomationSystemApplication.roleService = roleService;
        AutomationSystemApplication.productService = productService;
        AutomationSystemApplication.productGroupService = productGroupService;
        AutomationSystemApplication.propertyService = propertyService;
        AutomationSystemApplication.storageService = storageService;
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


        ProductGroup root = ProductGroup.builder()
                .title("mobile")
                .description("ddd")
                .parentGroup(null)
                .build();
        productGroupService.save(root);

        ProductGroup child1 = ProductGroup.builder()
                .title("apple")
                .description("ddd")
                .parentGroup(root)
                .build();
        productGroupService.save(child1);

        ProductGroup child2 = ProductGroup.builder()
                .title("samsung")
                .description("ddd")
                .parentGroup(root)
                .build();
        productGroupService.save(child2);

        ProductGroup child3 = ProductGroup.builder()
                .title("15 Pro")
                .description("ddd")
                .parentGroup(child1)
                .build();
        productGroupService.save(child3);

        ProductGroup productGroup = ProductGroup.builder()
                .title("electrical")
                .description("ddd")
                .parentGroup(child3)
                .childGroupList(List.of(child1,child3))
                .build();
        productGroupService.save(productGroup);

        Product product1 = Product.builder()
                .name("phone")
                .price(30000000F)
                .status(true)
                .dateTime(LocalDateTime.now())
                .productGroup(productGroup)
                .dateOfModified(LocalDateTime.now())
                .barcode(null)
                .build();
        productService.save(product1);

        Product product2 = Product.builder()
                .name("laptop")
                .price(100000000F)
                .status(true)
                .dateTime(LocalDateTime.now())
                .productGroup(productGroup)
                .dateOfModified(LocalDateTime.now())
                .barcode(null)
                .build();
        productService.save(product2);

        Storage storage = Storage.builder()
                .title("nameStorage")
                .count(1.0)
                .location("saadat abad")
                .description("aaa")
                .build();
        storageService.save(storage);

        Property property = Property.builder()
                .quantity(3.0)
                .inventoryStatus(InventoryStatus.Borrowed)
                .productGroup(productGroup)
                .productList(List.of(product1,product2))
                .user(user1)
                .storage(storage)
                .storageTransaction(null)
                .build();
        propertyService.save(property);
        System.out.println("Saved :" + property.getId());

    }
}
