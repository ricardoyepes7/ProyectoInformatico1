package com.innovasoft.PO2Academy.controller;

import com.innovasoft.PO2Academy.service.GlossaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/glossary")
public class GlossaryController {
    @Autowired
    private GlossaryService glossaryService;
    @GetMapping
    public String getGlossary(Model model){
        model.addAttribute("glosario",glossaryService.getAll());
        return "glossary";
    }
}
