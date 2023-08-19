package com.innovasoft.PO2Academy.infrastructure.output.jpa.adapter;

import com.innovasoft.PO2Academy.domain.model.User;
import com.innovasoft.PO2Academy.domain.spi.IUserPersistencePort;
import com.innovasoft.PO2Academy.infrastructure.exception.JpaException;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper.UserEntityMapper;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {
    private final IUserRepository userRepository;
    private final UserEntityMapper userEntityMapper;
    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .map(userEntityMapper::toModel)
                .orElseThrow(()->new JpaException("Usuario con username: "+username+" no encontrado."));
    }

    @Override
    public void update(User user) {
        userRepository.save(userEntityMapper.toEntity(user));
    }
}
