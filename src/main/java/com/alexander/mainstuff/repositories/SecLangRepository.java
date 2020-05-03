/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.mainstuff.repositories;

import org.springframework.stereotype.Repository;
import com.alexander.mainstuff.entities.SecondLanguage;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
@Repository
public interface SecLangRepository extends CrudRepository<SecondLanguage, Long>{
    
}
