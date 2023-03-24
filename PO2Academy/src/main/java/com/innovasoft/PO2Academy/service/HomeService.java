package com.innovasoft.PO2Academy.service;

import com.innovasoft.PO2Academy.dto.HomeDto;
import com.innovasoft.PO2Academy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    @Autowired
    private UserRepository userRepository;

    public HomeDto getUserData(String username){
        return new HomeDto(userRepository.findByEmail(username).get().getName(),33,98,50,9);
    }
}
