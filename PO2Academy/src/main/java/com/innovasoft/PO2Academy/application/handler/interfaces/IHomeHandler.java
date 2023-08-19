package com.innovasoft.PO2Academy.application.handler.interfaces;

import com.innovasoft.PO2Academy.application.dto.HomeDto;

public interface IHomeHandler {
    HomeDto getUserData(String username);
}
