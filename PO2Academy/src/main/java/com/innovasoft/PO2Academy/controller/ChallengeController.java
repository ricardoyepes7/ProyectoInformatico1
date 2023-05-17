package com.innovasoft.PO2Academy.controller;

import com.innovasoft.PO2Academy.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
@RequestMapping("/challenge")
public class ChallengeController {
    @Autowired
    private ChallengeService challengeService;
    @GetMapping
    public String getChallengeIndex(){
        return "challenge";
    }

    @GetMapping("/{type}")
    public String getQuizByType(@PathVariable("type") String type, Model model, Principal principal){
        try {
            model.addAttribute("Quiz",challengeService.getChallengeByName(type,principal.getName()));
            return "quiz";
        }catch (Exception e){
            return "redirect:/challenge";
        }

    }
}
