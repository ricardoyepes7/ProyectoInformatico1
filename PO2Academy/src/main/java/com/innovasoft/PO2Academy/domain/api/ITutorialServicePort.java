package com.innovasoft.PO2Academy.domain.api;

import com.innovasoft.PO2Academy.domain.model.Tutorial;

import java.util.List;

public interface ITutorialServicePort {
    List<Tutorial> getAllTutorials();
}
