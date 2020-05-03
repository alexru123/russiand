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
public class Grammar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
  
    String type;
    String property;
    String further_property1;
    String further_property2;

    public Grammar(){
        
    }
    
    public Grammar(String type, String property, String further_property1, String further_property2) {
       
        this.type = type;
        this.property = property;
        this.further_property1 = further_property1;
        this.further_property2 = further_property2;
    }

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getFurther_property1() {
        return further_property1;
    }

    public void setFurther_property1(String further_property1) {
        this.further_property1 = further_property1;
    }

    public String getFurther_property2() {
        return further_property2;
    }

    public void setFurther_property2(String further_property2) {
        this.further_property2 = further_property2;
    }

    @Override
    public String toString() {
        return "Grammar{" + "id=" + id + ", type=" + type + ", property=" + property + ", further_property1=" + further_property1 + ", further_property2=" + further_property2 + '}';
    }
    
  
    
}
