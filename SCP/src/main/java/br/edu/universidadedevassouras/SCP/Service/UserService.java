package br.edu.universidadedevassouras.SCP.Service;


import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements  UserDetailsService{



    @Override
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {

        //trocar pelo banco de dados

        return new SecurityProperties.User(username: "admin",
                password: "$2a$12$q4sLhcWJs2tV8NYF0GdagOKUIYMZ0953HP/bF4k0UrmCz5f.VtOfO"
               ,new ArrayList<>());
    }

}
