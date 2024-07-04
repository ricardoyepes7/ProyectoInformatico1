package com.innovasoft.PO2Academy.infrastructure.input.mvc;

import com.innovasoft.PO2Academy.application.handler.interfaces.ITutorialHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tutoriales")
@RequiredArgsConstructor
public class TutorialController {
    private final ITutorialHandler tutorialHandler;
    @GetMapping
    public String getTutorials(Model model){
        model.addAttribute("Tutorial",tutorialHandler.getTutorials());
        return "tutorial_view";
    }
}
