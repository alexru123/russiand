package com.alexander.mainstuff.controllers;

import com.alexander.mainstuff.entities.First_language;
import com.alexander.mainstuff.entities.Transcription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.validation.Valid;
import java.util.List;
import com.alexander.mainstuff.repositories.FirstLanguageRepository;
import com.alexander.mainstuff.repositories.TranscriptionRepository;

@Controller
public class FirstLanguageController {

    private final FirstLanguageRepository userRepository;
    private final TranscriptionRepository transcriptionRepository;
    
    @Autowired
    public FirstLanguageController(FirstLanguageRepository userRepository, TranscriptionRepository transcriptionRepository) {
        this.userRepository = userRepository;
        this.transcriptionRepository = transcriptionRepository;
    }

    @GetMapping("/signup")
    public String showSignUpForm(  @ModelAttribute("user") First_language user) {
        return "add-user";
    }

    @PostMapping("/adduser")
    public String addUser(@Valid @ModelAttribute("user") First_language user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }
        userRepository.save(user);
        model.addAttribute("users", userRepository.findAll());
        return  "redirect:/";
    }

    @GetMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        First_language user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("user", user);
        return "update-user";
    }

    @GetMapping("/search")
    public String searchUser(@RequestParam (name = "department", required = false) String department, Model model) {
        if (department == null || department.isEmpty()) {
            model.addAttribute("users", userRepository.findAll());
        } else {
            model.addAttribute("users", userRepository.findByDepartment(department));
        }
        model.addAttribute("department", department);
        return "index";
    }
    
    @PostMapping("/showTranscription/{id}")
    public String findTranscription(@PathVariable("id") long id_trans , Model model) {
        Transcription trans = transcriptionRepository.findById(id_trans).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id_trans));
        String trans_name = trans.getName();
        model.addAttribute("transcript", trans_name);
        return "index";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid First_language user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            user.setId(id);
            return "update-user";
        }

        userRepository.save(user);
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        System.out.println("ID:" + id);
        First_language user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        userRepository.delete(user);
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }
    
    
    
}
