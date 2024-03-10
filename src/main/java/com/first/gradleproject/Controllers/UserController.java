package com.first.gradleproject.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.first.gradleproject.Entities.User;
import com.first.gradleproject.ServiceImpl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired private UserServiceImpl userServiceImpl;

    @GetMapping("/getAllUserList")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> userList = null;
        try {
            userList = this.userServiceImpl.getAllUsers();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
    }

    @GetMapping("/getUserById/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") int userId) {
        User user = null;
        try {
            user = this.userServiceImpl.getUserById(userId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PostMapping("/addUserRecord")
    public ResponseEntity<User> addUserRecord(@RequestBody User user) {
        User saveUser = null;
        try {
            saveUser = this.userServiceImpl.addUserRecord(user);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<User>(saveUser, HttpStatus.OK);
    }
    
    @PutMapping("/updateUserRecord")
    public ResponseEntity<User> updateUserRecord(@RequestBody User user) {
        User updateUser = null;
        try {
            updateUser = this.userServiceImpl.updateUserRecord(user);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<User>(updateUser, HttpStatus.OK);
    }

    @DeleteMapping("/deleteUserRecord/{userId}")
    public ResponseEntity<User> updateUserRecord(@PathVariable("userId") int userId) {
        User deleteUser = null;
        try {
            deleteUser = this.userServiceImpl.deleteUserRecord(userId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<User>(deleteUser, HttpStatus.OK);
    }
}
