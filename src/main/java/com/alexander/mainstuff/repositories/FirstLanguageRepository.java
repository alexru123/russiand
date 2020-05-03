package com.alexander.mainstuff.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.alexander.mainstuff.entities.First_language;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface FirstLanguageRepository extends CrudRepository<First_language, Long> {
//    @Query("Select Transcription.name from Transcription where First_language.id= :Transcription.id_first")
//    String findTranscription(@Param("id") int id)
            ; // to do 
    // something like FROM TRANSCRIPTION SELECT word WHERE firstlanguage.id = transcription.id  
   
//    String findSecWord(String word); // to do 
   
    List<First_language> findByDepartment(String department);
    
}
