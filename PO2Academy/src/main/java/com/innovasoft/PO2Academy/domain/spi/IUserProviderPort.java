package com.innovasoft.PO2Academy.domain.spi;

import com.innovasoft.PO2Academy.domain.model.User;

public interface IUserProviderPort {
    User getUserByUsername(String username);
    void update(User user);
}
