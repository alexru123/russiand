package com.alexander.mainstuff.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class First_language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idsecond;
     
   
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idtrans;
    
    
    @NotBlank(message = "Wwedite russkoye slovo")
    private String name;


    @NotBlank(message = "Wwedite tip slova")
    private String department;
 
    private int knowledge_transcription;
    private int knowledge_gerword;
    

    public First_language() {}

    public First_language(long id, long idsecond, long idtrans, String name, String department, int knowledge_transcription, int knowledge_gerword) {
        this.id = id;
        this.idsecond = idsecond;
        this.idtrans = idtrans;
        this.name = name;
        this.department = department;
        this.knowledge_transcription = knowledge_transcription;
        this.knowledge_gerword = knowledge_gerword;
    }

    @Override
    public String toString() {
        return "First_language{" + "id=" + id + ", idsecond=" + idsecond + ", idtrans=" + idtrans + ", name=" + name + ", department=" + department + ", knowledge_transcription=" + knowledge_transcription + ", knowledge_gerword=" + knowledge_gerword + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdsecond() {
        return idsecond;
    }

    public void setIdsecond(long idsecond) {
        this.idsecond = idsecond;
    }

    public long getIdtrans() {
        return idtrans;
    }

    public void setIdtrans(long idtrans) {
        this.idtrans = idtrans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

 

    
}
