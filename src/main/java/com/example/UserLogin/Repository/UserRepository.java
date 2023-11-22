package com.example.UserLogin.Repository;

import com.example.UserLogin.Entity.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDtls, Long> {

    public boolean existsByEmail(String email);

    public UserDtls findByEmail(String email);

}
