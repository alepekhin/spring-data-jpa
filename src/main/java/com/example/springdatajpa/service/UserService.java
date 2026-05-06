package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Department;
import com.example.springdatajpa.entity.User;
import com.example.springdatajpa.repository.DepartmentRepository;
import com.example.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public User createUser(User user, int departmentId) {
        Department department = departmentRepository.findById(departmentId).orElse(null);
        if (department != null) {
            user.setDepartment(department);
            return userRepository.save(user);
        }
        return null;
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }

    // Add more CRUD methods as needed
}

