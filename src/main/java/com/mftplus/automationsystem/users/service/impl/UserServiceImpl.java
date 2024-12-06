package com.mftplus.automationsystem.users.service.impl;

import com.mftplus.automationsystem.users.model.Role;
import com.mftplus.automationsystem.users.model.User;
import com.mftplus.automationsystem.users.repository.UserRepository;
import com.mftplus.automationsystem.users.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
//        if (!userRepository.existsUserByUsername(user.getUsername())) {
//            user.setPassword(bCryptPasswordEncoder().encode(user.getPassword()));
//            userRepository.save(user);
//        }
    }

    @Override
    public void update(User user) {
//        user.setPassword(bCryptPasswordEncoder().encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public void delete(String username) {
        userRepository.deleteById(username);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findById(username).orElse(null);
    }

    @Override
    public boolean existsByUsername(String username) {
        return userRepository.existsById(username);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findByRole(Role role) {
        return null; // userRepository.findByRoleSetContaining(role);
    }

    @Override
    public List<User> findByRoleName(String roleName) {
        return null; // userRepository.findByRoleSetName(roleName);
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return null; // userRepository.findByUsernameAndPassword(username, password).orElse(null);
    }
}
