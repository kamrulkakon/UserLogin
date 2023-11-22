package com.example.UserLogin.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class UserDtls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fullname;
    private String address;
    private String email;
    private String qualification;
    private String password;

}
