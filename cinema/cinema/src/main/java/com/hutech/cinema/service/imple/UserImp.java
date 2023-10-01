package com.hutech.cinema.service.imple;

import com.hutech.cinema.entity.Users;
import com.hutech.cinema.repository.UserRepository;
import com.hutech.cinema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> findAllUser() {
        return (List<Users>)  userRepository.findAll();
    }

    @Override
    public Users saveUser(Users users) {
        return userRepository.save(users);
    }

    @Override
    public void deleteUser(Users users) {
        userRepository.delete(users);
    }

    @Override
    public void updateUser(Users users) {
        saveUser(users);
    }

    @Override
    public void deleteUserById(Long id_User) {
        userRepository.deleteById(id_User);
    }

    @Override
    public Optional<Users> findById(Long id_User) {
        return userRepository.findById(id_User);
    }

    @Override
    public Users findByName (String loginName){
        return userRepository.findByNameUser(loginName);
    }


    @Override
    public boolean isUserExist(Users users) {
        return userRepository.findByNameUser(users.getLoginUser()) != null;
    }
}
