package com.innovasoft.PO2Academy.infrastructure.configuration.security.service;

import com.innovasoft.PO2Academy.infrastructure.output.jpa.entity.UserEntity;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user= userRepository.findByUsername(username)
                .orElseThrow(()->new UsernameNotFoundException("El usuario no está registrado."));
        return new Principal(user);
    }
}
