package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IUserServicePort;
import com.innovasoft.PO2Academy.domain.model.User;
import com.innovasoft.PO2Academy.domain.spi.IUserPersistencePort;

public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public User getUserByUsername(String username) {
        return userPersistencePort.getUserByUsername(username);
    }

    @Override
    public void update(User user) {
        userPersistencePort.update(user);
    }
}
