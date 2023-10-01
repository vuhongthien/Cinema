package com.hutech.cinema.service;

import com.hutech.cinema.entity.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<Users> findAllUser();

    Users saveUser(Users users);

    void deleteUser(Users users);

    void updateUser(Users users);

    void deleteUserById(Long id_User);

    Optional<Users> findById(Long id_User);

    Users findByName(String loginUser);

    boolean isUserExist(Users users);

}
