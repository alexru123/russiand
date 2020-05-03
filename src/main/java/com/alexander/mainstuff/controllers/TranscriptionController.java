/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.alexander.mainstuff.controllers;


import com.alexander.mainstuff.entities.Transcription;
import com.alexander.mainstuff.repositories.TranscriptionRepository;
import java.util.Collection;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@Controller
public class TranscriptionController {
    private final TranscriptionRepository transcriptionRepository;

    @Autowired
    public TranscriptionController(TranscriptionRepository transcriptionRepository) {
        this.transcriptionRepository = transcriptionRepository;
    }

    @GetMapping("/signtrans")
    public String showTranscriptionForm(Transcription transcription) {
        return "add-transcription";
    }

    @PostMapping("transcriptionlist/addtranscription")
    public String addTranscription(@Valid Transcription transcription, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-transcription";
        }
        transcriptionRepository.save(transcription);
        model.addAttribute("transcriptions", transcriptionRepository.findAll());
        return  "redirect:/transcriptionlist";
    }

    
    @PostMapping("transcriptionlist/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid Transcription transcription, BindingResult result, Model model) {
        if (result.hasErrors()) {
            transcription.setId(id);
            return "update-transcription";
        }
        System.out.println("ID:" + id);
        transcriptionRepository.save(transcription);
        model.addAttribute("users", transcriptionRepository.findAll());
        return "transcriptionlist";
    }
    
    @GetMapping("/transcriptionlist")
    public String showTransIndex(Model model) {
        model.addAttribute("transcriptions", transcriptionRepository.findAll());
        return "transcriptionlist";
    }

   @GetMapping("transcriptionlist/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        System.out.println("ID:" + id);
        Transcription transcript = transcriptionRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid transcription Id:" + id));
        model.addAttribute("transcription", transcript);
        return "update-transcription";
    }


    @GetMapping("/transcriptionlist/delete/{id}")
      public String deleteTranscription(@PathVariable("id") long id, Model model) {
      System.out.println("ID:" + id);
      Transcription transcript = transcriptionRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid transcription Id:" + id));
      transcriptionRepository.delete(transcript);
      model.addAttribute("transcriptions", transcriptionRepository.findAll());
      return "transcriptionlist";
    }
      
      
  
}

