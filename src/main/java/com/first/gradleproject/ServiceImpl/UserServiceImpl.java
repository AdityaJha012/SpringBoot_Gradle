package com.first.gradleproject.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.first.gradleproject.Entities.User;
import com.first.gradleproject.Repositories.UserRepository;
import com.first.gradleproject.Services.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return (List<User>) this.userRepository.findAll();
    }

    @Override
    public User getUserById(int userId) {
        return this.userRepository.findById(userId).orElse(null);
    }

    @Override
    public User addUserRecord(User user) {
        if (user != null){
            return this.userRepository.save(user);
        } else {
            throw new IllegalArgumentException("User Object is Null!");
        }
    }

    @Override
    public User updateUserRecord(User user) {
        if (user != null){
            return this.userRepository.save(user);
        } else {
            throw new IllegalArgumentException("User Object is Null!");
        }
    }

    @Override
    public User deleteUserRecord(int userId) {
        User deleteUser = null;
        try {
            deleteUser = this.userRepository.findById(userId).orElse(null);
            if(deleteUser != null){
                this.userRepository.delete(deleteUser);
            } else {
                throw new Exception("User Not Found!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return deleteUser;
    }
    
}
