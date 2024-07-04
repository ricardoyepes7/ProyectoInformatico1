package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IUserServicePort;
import com.innovasoft.PO2Academy.domain.model.User;
import com.innovasoft.PO2Academy.domain.spi.IUserProviderPort;

public class UserUseCase implements IUserServicePort {
    private final IUserProviderPort userProviderPort;

    public UserUseCase(IUserProviderPort userProviderPort) {
        this.userProviderPort = userProviderPort;
    }

    @Override
    public User getUserByUsername(String username) {
        return userProviderPort.getUserByUsername(username);
    }

    @Override
    public void update(User user) {
        userProviderPort.update(user);
    }
}
