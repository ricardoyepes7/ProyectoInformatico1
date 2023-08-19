package com.innovasoft.PO2Academy.infrastructure.input.mvc.controller;

import com.innovasoft.PO2Academy.application.handler.interfaces.IHomeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping({"/home", "/home/", "/"})
@RequiredArgsConstructor
public class HomeController {
    private final IHomeHandler homeHandler;

    @GetMapping()
    public String home(Principal principal, Model model) {
        model.addAttribute("Data", homeHandler.getUserData(principal.getName()));
        return "home";
    }


}
