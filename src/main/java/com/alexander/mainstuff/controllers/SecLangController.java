/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.alexander.mainstuff.controllers;


import com.alexander.mainstuff.entities.SecondLanguage;
import com.alexander.mainstuff.repositories.SecLangRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author user
 */
@Controller
public class SecLangController {
    private final SecLangRepository seclangRepository;

    @Autowired
    public SecLangController(SecLangRepository seclangRepository) {
        this.seclangRepository = seclangRepository;
    }

    @GetMapping("/signsec")
    public String showSecondLanguageForm(@ModelAttribute("seclang") SecondLanguage secondLanguage) {
        return "add-sec";
    }
    
  
    
    @PostMapping("secondlanglist/secadd")
    public String addSecondLanguage(@Valid SecondLanguage secondLanguage, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-sec";
        }
        
        seclangRepository.save(secondLanguage);
        model.addAttribute("seclangs", seclangRepository.findAll());
        return  "redirect:/secondlanglist";
    }
    
    @GetMapping("/secondlanglist")
    public String showSecondLanguageIndex(Model model) {
        model.addAttribute("seclangs", seclangRepository.findAll());
        return "secondlanglist";
    }
    
    @PostMapping("secondlanglist/secupdate/{id}")
    public String updateSecondLanguage(@PathVariable("id") long id, @Valid SecondLanguage secondLanguage, BindingResult result, Model model) {
        if (result.hasErrors()) {
            secondLanguage.setId(id);
            return "update-transcription";
        }
        seclangRepository.save(secondLanguage);
        model.addAttribute("seclangs", seclangRepository.findAll());
        return "transcriptionlist";
    }
    
  

   @GetMapping("secondlanglist/secedit/{id}")
    public String showSecUpdateForm(@PathVariable("id") long id, Model model) {
        SecondLanguage secondLanguage = seclangRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid second language Id:" + id));
        model.addAttribute("seclang", secondLanguage);
        return "update-transcription";
    }


    @GetMapping("/secondlanglist/secdelete/{id}")
      public String deleteSecondLanguageWord(@PathVariable("id") long id, Model model) {
      SecondLanguage secondLanguage = seclangRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid second Language Id:" + id));
      seclangRepository.delete(secondLanguage);
      model.addAttribute("seclang", seclangRepository.findAll());
      return "secondlanglist";
    }
      
}


