/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.mainstuff.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class SecondLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long id_first;
    private String word;
    private int points_knowledge;
    private int points_transcription;
    private String forms;

    public SecondLanguage(){
        
    }

    public SecondLanguage(long id, long id_first, String word, int points_knowledge, int points_transcription, String forms) {
        this.id = id;
        this.id_first = id_first;
        this.word = word;
        this.points_knowledge = points_knowledge;
        this.points_transcription = points_transcription;
        this.forms = forms;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_first() {
        return id_first;
    }

    public void setId_first(long id_first) {
        this.id_first = id_first;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getPoints_knowledge() {
        return points_knowledge;
    }

    public void setPoints_knowledge(int points_knowledge) {
        this.points_knowledge = points_knowledge;
    }

    public int getPoints_transcription() {
        return points_transcription;
    }

    public void setPoints_transcription(int points_transcription) {
        this.points_transcription = points_transcription;
    }

    public String getForms() {
        return forms;
    }

    public void setForms(String forms) {
        this.forms = forms;
    }

    @Override
    public String toString() {
        return "SecondLanguage{" + "id=" + id + ", id_first=" + id_first + ", word=" + word + ", points_knowledge=" + points_knowledge + ", points_transcription=" + points_transcription + ", forms=" + forms + '}';
    }

  
    
    
    
    
}
