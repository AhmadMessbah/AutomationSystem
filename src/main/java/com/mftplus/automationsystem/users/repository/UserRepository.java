package com.mftplus.automationsystem.users.repository;

import com.mftplus.automationsystem.users.model.Role;
import com.mftplus.automationsystem.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    boolean existsUserByUsername(String username);
//    List<User> findByFirstNameIsLikeAndLastNameIsLike(String firstName, String lastName);
    User findByUsername(String username);
    Optional<User> findByUsernameAndPassword(String username, String password);
    List<User> findByRoleSetContaining(Role role);
    List<User> findByRoleSetName(String roleName);
}
