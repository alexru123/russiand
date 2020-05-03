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
import javax.validation.constraints.NotBlank;

@Entity
public class Transcription {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private long id_first;
    private long id_german;

    private String name;
    private int knowledge_transcription;
    private int knowledge_gerword;

    public Transcription() {}

    public Transcription(long id, long id_first, long id_german, String name, int knowledge_transcription, int knowledge_gerword) {
        this.id = id;
        this.id_first = id_first;
        this.id_german = id_german;
        this.name = name;
        this.knowledge_transcription = knowledge_transcription;
        this.knowledge_gerword = knowledge_gerword;
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

    public long getId_german() {
        return id_german;
    }

    public void setId_german(long id_german) {
        this.id_german = id_german;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKnowledge_transcription() {
        return knowledge_transcription;
    }

    public void setKnowledge_transcription(int knowledge_transcription) {
        this.knowledge_transcription = knowledge_transcription;
    }

    public int getKnowledge_gerword() {
        return knowledge_gerword;
    }

    public void setKnowledge_gerword(int knowledge_gerword) {
        this.knowledge_gerword = knowledge_gerword;
    }

    @Override
    public String toString() {
        return "Transcription{" + "id=" + id + ", id_first=" + id_first + ", id_german=" + id_german + ", name=" + name + ", knowledge_transcription=" + knowledge_transcription + ", knowledge_gerword=" + knowledge_gerword + '}';
    }

    
}
