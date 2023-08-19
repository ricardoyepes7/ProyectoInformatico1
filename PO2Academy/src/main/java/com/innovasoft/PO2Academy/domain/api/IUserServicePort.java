package com.innovasoft.PO2Academy.domain.api;

import com.innovasoft.PO2Academy.domain.model.User;

public interface IUserServicePort {
    User getUserByUsername(String username);
    void update(User user);
}
