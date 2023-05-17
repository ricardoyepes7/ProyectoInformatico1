package com.innovasoft.PO2Academy.service;

import com.innovasoft.PO2Academy.entity.User;
import com.innovasoft.PO2Academy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepository.findByUsername(username)
                .orElseThrow(()->new UsernameNotFoundException("El usuario no está registrado."));
        return new Principal(user);
    }
}
