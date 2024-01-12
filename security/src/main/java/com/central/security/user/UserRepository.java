package com.central.security.user;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    public User GetUserByEmail(String email) {

        if(!email.equals("userAppAdm123")) {
            throw new UsernameNotFoundException("User Not Found");
        }

        return User.builder()
                .firstName(email)
                .lastName(email)
                .email(email)
                .password("$2a$10$4UuE2443Emi4dYudR78CH.comEcNdKqEA40.mUoLjokdhD99NxLBG")
                .role(Role.USER).build();


    }
}
