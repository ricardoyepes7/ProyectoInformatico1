package com.innovasoft.PO2Academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tutoriales")
public class TutorialController {
    @GetMapping
    public String getTutorials(){
        return "tutorial";
    }
}
