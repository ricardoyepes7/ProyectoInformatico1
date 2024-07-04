package com.innovasoft.PO2Academy.infrastructure.input.mvc;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    public String login(@AuthenticationPrincipal UserDetails userDetails) {
        return (userDetails == null) ? "login_view" : "redirect:/home";
    }
}

