package com.example.UserLogin.Service;

import com.example.UserLogin.Entity.UserDtls;
import com.example.UserLogin.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepo;
    @Override
    public UserDtls createUser(UserDtls user) {
        return userRepo.save(user);
    }

    @Override
    public boolean checkEmail(String email) {
        return false;
    }
}
