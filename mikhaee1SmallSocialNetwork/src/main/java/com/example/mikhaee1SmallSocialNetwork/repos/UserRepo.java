package com.example.mikhaee1SmallSocialNetwork.repos;

import com.example.mikhaee1SmallSocialNetwork.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mikhaee1
 */

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}