package com.innovasoft.PO2Academy.infrastructure.input.mvc;

import com.innovasoft.PO2Academy.application.handler.interfaces.IChallengeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/challenge")
@RequiredArgsConstructor
public class ChallengeController {
    private final IChallengeHandler challengeHandler;

    @GetMapping
    public String getChallengeIndex() {
        return "challenge_view";
    }

    @GetMapping("/{type}")
    public String getQuizByType(@PathVariable("type") String type, Model model, Principal principal) {
        model.addAttribute("quiz", challengeHandler.getChallengeByName(type, principal.getName()));
        return "quiz_view";
    }
}
