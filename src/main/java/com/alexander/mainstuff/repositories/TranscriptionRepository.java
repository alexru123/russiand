/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.mainstuff.repositories;

import com.alexander.mainstuff.entities.Transcription;
import java.util.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * 
 * @author user
 */
@Repository
public interface TranscriptionRepository extends CrudRepository<Transcription, Long>{
//  @Query(
//  value = "INSERT INTO TRANSCRIPTION(ID, ID_FIRST, ID_GERMAN,KNOWLEDGE_GERWORD, KNOWLEDGE_TRANSCRIPTION,NAME)\n" +
//  "SELECT ID_TRANS, ID,ID_SECOND, 0 AS KNOWLEDGE_GERWORD, 0 AS KNOWLEDGE_TRANSCRIPTION, ' ' AS NAME FROM USER ;", 
//  nativeQuery = true)
//  Collection<Transcription> usertoTranscriptions();
}

