package com.innovasoft.PO2Academy.infrastructure.input.mvc;

import com.innovasoft.PO2Academy.application.handler.interfaces.IGlossaryHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/glossary")
@RequiredArgsConstructor
public class GlossaryController {
    private final IGlossaryHandler glossaryHandler;
    @GetMapping
    public String getGlossary(Model model){
        model.addAttribute("glossary",glossaryHandler.getAllGlossaries());
        return "glossary_view";
    }
}
