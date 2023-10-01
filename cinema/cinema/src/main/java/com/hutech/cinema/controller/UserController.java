package com.hutech.cinema.controller;

import com.hutech.cinema.entity.Users;
import com.hutech.cinema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

//@CrossOrigin(origins = "http://localhost:8081")

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Create a new user
     *
     * @return a new user
     */

    @PostMapping(value = "/createusers")
    public ResponseEntity<Users> createUser (@RequestBody Users users){

        return new ResponseEntity<>(userService.saveUser(users),HttpStatus.CREATED);
    }

    /**
     * Get all user in database
     *
     * @return List <User></User>
     */

    @GetMapping(value = "/users")
    public ResponseEntity<Iterable<Users>> getUser(){
        return new ResponseEntity<>(userService.findAllUser(),HttpStatus.OK);

    }

    /**
     * Get user with Id
     *
     * @ Return User
     */

    @GetMapping(value = "/users/{id}")

    public ResponseEntity<Users> getUserById(@PathVariable("id") long id){
        Optional<Users> user = userService.findById(id);
        if (user.isEmpty())
            throw new RuntimeException("not found Id"+ id);

        return new ResponseEntity<>(user.get(),HttpStatus.OK);

    }

    /**
     * Delete user by id
     *
     */

    @DeleteMapping(value = "/user/{id}")

    public ResponseEntity<Users> deleteUser (@PathVariable(value = "id") Long id){
        userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /**
     * Update user by Id
     */

    @PutMapping(value = "/users/{id}")

    public ResponseEntity<Objects> updateUser(@RequestBody Users users, @PathVariable(value = "id")Long id){
        Optional<Users> userOptional = userService.findById(id);
        if (userOptional.isEmpty())
            return ResponseEntity.notFound().build();
        users.setId(id);
        userService.updateUser(users);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
