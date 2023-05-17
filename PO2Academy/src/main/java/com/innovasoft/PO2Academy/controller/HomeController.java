package com.innovasoft.PO2Academy.controller;

import com.innovasoft.PO2Academy.dto.HomeDto;
import com.innovasoft.PO2Academy.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
@RequestMapping({ "/home", "/home/", "/" })
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping()
    public String home(Principal principal, Model model) {
        model.addAttribute("Data",homeService.getUserData(principal.getName()));
        return "home";
    }


}
