package com.first.gradleproject.Services;

import java.util.List;
import com.first.gradleproject.Entities.User;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(int userId);
    public User addUserRecord(User user);
    public User updateUserRecord(User user);
    public User deleteUserRecord(int userId);
}
