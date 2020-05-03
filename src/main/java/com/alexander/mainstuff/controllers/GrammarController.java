/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.alexander.mainstuff.controllers;



import com.alexander.mainstuff.repositories.GrammarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GrammarController {
    private final GrammarRepository grammarRepository;

    @Autowired
    public GrammarController(GrammarRepository grammarRepository) {
        this.grammarRepository = grammarRepository;
    }

      
    @GetMapping("/grammarlist")
    public String showTransIndex(Model model) {
        model.addAttribute("grammaticals", grammarRepository.findAll());
        return "grammarlist";
    }

}


