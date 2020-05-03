/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.mainstuff.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 *
 * @author user
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.alexander.mainstuff"})
@EnableJpaRepositories(basePackages="com.alexander.mainstuff.repositories")
@EnableTransactionManagement
@EntityScan(basePackages="com.alexander.mainstuff.entities")
public class MainApplication {
     public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
