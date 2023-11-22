package com.example.UserLogin.Service;


import com.example.UserLogin.Entity.UserDtls;


public interface UserService {

    public UserDtls createUser(UserDtls user);

    public boolean checkEmail(String email);

}
